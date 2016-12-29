package zz_etc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.jsoup.Jsoup;

public class DaumWT{
	
	public JsonNode getJson (String url) throws Exception, IOException {
		String jsonStr = Jsoup.connect(url).ignoreContentType(true).execute().body();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(jsonStr);
		
		if (rootNode.path("result").path("status").asText().equals("200"))
			return rootNode.path("data");
		else 
			return null;
	}
	
	public List<Episode> getSingleId(String webtoonName) throws Exception{
		String url = "http://webtoon.daum.net/data/pc/webtoon/view/" + webtoonName;
	
		JsonNode dataNode = new DaumWT().getJson(url);
		List<Episode> episodes = new ArrayList<>();
		JsonNode webtoonNode = dataNode.path("webtoon");
		
		for (JsonNode node : (ArrayNode) webtoonNode.path("webtoonEpisodes"))
			episodes.add(new Episode(node.path("id").asText(), node.path("title").asText(), null));
		
		return episodes;
	}
	
	public List<Episode> getViewer(List<Episode> episodes) throws Exception{
		String url = "http://webtoon.daum.net/data/pc/webtoon/viewer_images/";
		
		for (int i = 0; i < episodes.size(); i++) {
			JsonNode dataNode = new DaumWT().getJson(url + episodes.get(i).getId());
			if (dataNode != null) {
				ArrayNode dataArray = (ArrayNode) dataNode;
				List<Viewer> viewers = new ArrayList<>();
				
				for (JsonNode node : dataArray)
					viewers.add(new Viewer(node.path("imageOrder").asText(), node.path("url").asText()));
				
				episodes.get(i).setViewer(viewers);
			}
		}
		
		return episodes;
	}
	
	public void makeLocalWebtoon(List<Episode> episodes, String local, String webtoonName) throws Exception{
		for (Episode episode : episodes) {
			File dir = new File(local + webtoonName + "\\" + episode.getTitle() + "\\");
			if (!dir.isDirectory()) 
				dir.mkdirs();
			
		}
		for (Episode episode : episodes) {
			if (episode.getViewer() != null) {
				for (Viewer viewer : episode.getViewer()){
					URL url = new URL(viewer.getUrl());
					BufferedImage img = ImageIO.read(url);
					File file = new File(local + webtoonName + "\\" + episode.getTitle() + "\\" + viewer.getUrlNo() +".jpg");
					ImageIO.write(img, "jpg", file);
				}
			}
		}
	}
	
	class Episode {
		private String id; // 40242
		private String title; // 198화
		private List<Viewer> viewer;
		public Episode() {
			// TODO Auto-generated constructor stub
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<Viewer> getViewer() {
			return viewer;
		}
		public void setViewer(List<Viewer> viewer) {
			this.viewer = viewer;
		}
		public Episode(String id, String title, List<Viewer> viewer) {
			super();
			this.id = id;
			this.title = title;
			this.viewer = viewer;
		}	
	}
	
	class Viewer {
		private String urlNo; //이미지 순서
		private String url; //이미지 url
		public String getUrlNo() {
			return urlNo;
		}
		public void setUrlNo(String urlNo) {
			this.urlNo = urlNo;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public Viewer(String urlNo, String url) {
			super();
			this.urlNo = urlNo;
			this.url = url;
		}
	}
	
	public static void main(String[] args) throws Exception {
		// 웹툰이름 : 다음 웹툰 사이트에 들어가면 url 마지막에 나오는 이름
		String webtoonName = "mujang";
		// 웹툰 저장할 경로
		String local = "C:\\";
		List<Episode> episodes = new ArrayList<>();
		episodes = new DaumWT().getSingleId(webtoonName);
		// 테스트를 위한 코드
		Episode tmp = episodes.get(19);
		episodes = new ArrayList<>();
		episodes.add(tmp);
		// 테스트를 위한 코드		

		episodes = new DaumWT().getViewer(episodes);
		new DaumWT().makeLocalWebtoon(episodes, local, webtoonName);
		
	}
}
