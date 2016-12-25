package naver.webtoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import naver.webtoon.model.Naver_Webtoon_weekday;

public class Naver_Webtoon_getWeekdayList {
	public List<Naver_Webtoon_weekday> getWeekdayWebtoonList(String url){
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
					item.setArtist(elm.select("dl dd.desc a").text());
					item.setStarScore(Float.parseFloat(elm.select("dl dd div.rating_type strong").text()));
					weekdayWebtoonList.add(item);				
			}
		} catch(IOException ie){
			ie.printStackTrace();
		}
		return weekdayWebtoonList;
	}
}
