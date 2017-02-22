package common;

import java.util.List;

import naver.movie.NaverMovie;
import naver.movie.model.NaverMovieVO;
import naver.news.NaverNews;
import naver.news.model.NaverNewsContentVO;
import naver.news.model.NaverNewsVO;
import naver.news.viewer.NaverNewsViewer;

public class Run2 {
	public static void main(String[] args) {
/*
	// http://news.naver.com/main/list.nhn?sid1=001&listType=title&mid=sec&mode=LSD&date=20170115&page=1
	   http://news.naver.com/main/list.nhn?sid2=265&sid1=100&mid=shm&mode=LS2D&date=20170115&page=1
		
	input 
		sid = 001-속보, 100-정치, 101-경제, 102-사회, 104-생활/문화, 105-세계, 106-IT/과학, 107-연예, ... 상단 카테고리
		listType =  = title 제목별로 보기, summary = 요약별로 보기, photo = 이미지만 보기
		date = 날짜
		page = 페이징
*/
		// 뉴스 리스트 블러오는 부분
//		List<NaverNewsVO> news = new NaverNews().getNewsList("106", "photo", "20170115", 1);
		//new NaverNewsViewer().newsViewer(news);
		//
		
		// 뉴스의 각 url에서 content 부분 불러오는 부분
/*		for (NaverNewsVO content : news) {
			NaverNewsContentVO item = new NaverNews().getContentList(content.getLink());
			new NaverNewsViewer().newsContentViewer(item);
		}*/
		

		//http://movie.naver.com/movie/running/current.nhn?view=list&tab=normal&order=open
		// tab : normal - 상영영화 / festival - 영화제
		// order : open - 개봉순 / reserve - 예메순 / point - 평점순 / likeCount - 좋아요순
		
		List<NaverMovieVO> movieList = new NaverMovie().getNaverMovie("normal", "open");
	}
}
