package naver.webtoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import common.Url;
import naver.webtoon.model.Naver_Webtoon_weekday;

public class Naver_Webtoon {
	public List<Naver_Webtoon_weekday> getWeekdayWebtoonList(String week,String  orderType){
		String url = new Url().getWeekdayWebtoon(week, orderType);
		List<Naver_Webtoon_weekday> weekdayWebtoonList = new ArrayList<>();
		try {
			Document doc = Jsoup.connect(url).get();
			Elements area = doc.select("div#content div.list_area ul.img_list li");
			Iterator<Element> iter = area.iterator();
			while (iter.hasNext()){
				Element elm = iter.next();
				//System.out.println(elm.text());
					Naver_Webtoon_weekday item = new Naver_Webtoon_weekday();
					item.setImgUrl(elm.select("div.thumb a img").attr("src"));
					item.setTitle(elm.select("dl dt a").text());
					String titleId = elm.select("dl dt a").attr("href");
					String id = titleId.split("titleId=")[1].split("&")[0];
					item.setTitleId(Integer.parseInt(id));
					item.setArtist(elm.select("dl dd.desc a").text());
					item.setStarScore(Float.parseFloat(elm.select("dl dd div.rating_type strong").text()));
					weekdayWebtoonList.add(item);				
			}
		} catch(IOException ie){
			ie.printStackTrace();
		}
		return weekdayWebtoonList;
	}
	public List<String> getWebtoonSingleContent(String titleId, int no, String week){
		String url = new Url().getWebtoonSingleContent(titleId, no, week);
		List<String> urls = new ArrayList<>();
			try {
				Document doc = Jsoup.connect(url).get();
				Elements area = doc.select("div#comic_view_area div.wt_viewer img");
				Iterator<Element> iter = area.iterator();
				while (iter.hasNext()){
					Element elm = iter.next();
					System.out.println(elm.attr("src"));			
				}
			} catch(IOException ie){
				ie.printStackTrace();
			}
		return urls;
	}
}
