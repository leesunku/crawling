package naver.movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import common.Url;
import naver.movie.model.NaverMovieVO;

public class NaverMovie {
	
	//http://movie.naver.com/movie/running/current.nhn?view=list&tab=normal&order=open
	// tab : normal - 상영영화 / festival - 영화제
	// order : open - 개봉순 / reserve - 예메순 / point - 평점순 / likeCount - 좋아요순
	String url = new Url().getNaverMovie("normal", "open");
	List<NaverMovieVO> movieList = new ArrayList<>();
	
	public List<NaverMovieVO> getNaverMovie(String tab, String order){
		String url = new Url().getNaverMovie(tab, order);
		List<NaverMovieVO> movieList = new ArrayList<>();
		try{
			Document doc = Jsoup.connect(url).get();
			Elements area = doc.select("#content .article .obj_section .lst_wrap ul.lst_detail_t1 li");
			Iterator<Element> iter = area.iterator();
			while (iter.hasNext()) {
				NaverMovieVO movie = new NaverMovieVO();
				Element elm = iter.next();
				movie.setImgUrl(elm.select("div.thumb a img").attr("src"));
				movie.setGrade(elm.select("dl.lst_dsc dt.tit span").text());
				movie.setTitle(elm.select("dl.lst_dsc dt.tit a").text());
				System.out.println(elm.select("dl.lst_dsc dt.tit a").text());
				movieList.add(movie);
			}
		} catch(IOException ie){
			ie.printStackTrace();
		}
		return null;		
	}
}
