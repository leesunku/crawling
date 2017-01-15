package naver.news;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import common.Url;
import naver.main.model.Naver_realTimeKeyword;
import naver.news.model.NaverNewsContentVO;
import naver.news.model.NaverNewsVO;

public class NaverNews {
	public List<NaverNewsVO> getNewsList(String sid, String listType, String date, int page){
		String url = new Url().getNewsUrl(sid, listType, date, page);
		//System.out.println(url);
		List<NaverNewsVO> newsList = new ArrayList<>();
		try {
			Document doc = Jsoup.connect(url).get();
			Elements area = doc.select(getArea(listType));
			Iterator<Element> iter = area.iterator();
			while (iter.hasNext()){
				Element elm = iter.next();
				NaverNewsVO news = new NaverNewsVO();
				if ("title".equals(listType))
					newsList.add(listTypeTitle(elm));
				else if ("summary".equals(listType))
					newsList.add(listTypeSummary(elm));
				else if ("photo".equals(listType))
					newsList.addAll(listTypePhoto(elm));
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return newsList;
	}
	
	private String getArea (String key) {
		Map<String, String> area = new HashMap<>();
		if (!area.containsKey(key)){
			area.put("title", "#main_content .list_body ul li");
			area.put("summary", "#main_content .list_body ul li");
			area.put("photo", "#main_content .newsflash_body ul.photo_list li");
		}
		return area.get(key);
	}
	
	private NaverNewsVO listTypeTitle (Element elm){
		NaverNewsVO news = new NaverNewsVO();
		news.setLink(elm.select("a").attr("href"));
		news.setWriting(elm.select("span.writing").text());
		news.setDate(elm.select("span.date").text());
		return news;
	}
	
	private NaverNewsVO listTypeSummary (Element elm){
		NaverNewsVO news = new NaverNewsVO();
		
		news.setImgUrl(elm.select("dl dt.photo").select("a img").attr("src"));
		news.setTitle(elm.select("dl dt").select("a").text());
		news.setLink(elm.select("dl dt").select("a").attr("href"));
		news.setSummary(elm.select("dl dd").html().split("<span")[0]);
		news.setWriting(elm.select("dl dd span.writing").text());
		news.setDate(elm.select("dl dd span.date").text());
		return news;
	}
	
	private List<NaverNewsVO> listTypePhoto (Element elm){
		List<NaverNewsVO> newsList = new ArrayList<>();
		Elements trs = elm.select("table tbody tr");
		for (int a = 0; a < trs.get(0).select("td").size(); a++) {
			NaverNewsVO news = new NaverNewsVO();
			news.setLink(trs.get(0).select("td").get(a).select("a").attr("href"));
			news.setImgUrl(trs.get(0).select("td").get(a).select("a img").attr("src"));
			news.setTitle(trs.get(1).select("td").get(a).select("a").text());
			newsList.add(news);
		}
		return newsList;
	}
	
	// 뉴스 컨텐츠 
	public NaverNewsContentVO getContentList(String url){
		//http://news.naver.com/main/read.nhn?mode=LSD&mid=sec&sid1=106&oid=312&aid=0000233016&type=1
		NaverNewsContentVO content = new NaverNewsContentVO();
		try {
			Document doc = Jsoup.connect(url).get();
			Elements area = doc.select("#content div.end_ct div.end_ct_area");
			Element contentArea = area.get(0);
			content.setTitle(contentArea.select("p").text());
			content.setDate(contentArea.select("div.article_info span.author").get(0).select("em").text());
			content.setContent(contentArea.select("div#articeBody").text());
		} catch(IOException ie){
			ie.printStackTrace();
		}
		return content;
	}
}
