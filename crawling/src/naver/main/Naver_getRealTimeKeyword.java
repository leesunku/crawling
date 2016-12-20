package naver.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import naver.main.model.Naver_realTimeKeyword;

public class Naver_getRealTimeKeyword {
	public List<Naver_realTimeKeyword> getRealTimeKeyword(String url){
		List<Naver_realTimeKeyword> realTimeKeywordList = new ArrayList<>();
		try {
			Document doc = Jsoup.connect(url).get();
			Elements area = doc.select("#realrank li");
			Iterator<Element> iter = area.iterator();
			while (iter.hasNext()){
				Element elm = iter.next();
				if (!(elm.attr("id") !=null && "lastrank".equals(elm.attr("id")))){
					Naver_realTimeKeyword item = new Naver_realTimeKeyword();
					item.setRank(Integer.parseInt(elm.attr("value")));
					item.setKeyword(elm.select("a").attr("title"));
					item.setPoint(Integer.parseInt(elm.select("a span.rk").text()));
					item.setState(elm.select("a span.tx").text());
					item.setLink(elm.select("a").attr("href"));	
					realTimeKeywordList.add(item);				
				}
			}
		} catch(IOException ie){
			ie.printStackTrace();
		}
		return realTimeKeywordList;
	}
}
