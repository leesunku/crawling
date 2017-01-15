package common;

import java.util.List;

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
		listType =  = title 제목별로 보기, summary = 요약별로 보기, photo = 이미지만 보기
		sid = 001-속보, 100-정치, 101-경제, 102-사회, 104-생활/문화, 105-세계, 106-IT/과학, 107-연예, ... 상단 카테고리
		page = 페이징
		date = 날짜
*/
		// 뉴스 리스트 블러오는 부분
		List<NaverNewsVO> news = new NaverNews().getNewsList("106", "photo", "20170115", 1);
		//new NaverNewsViewer().newsViewer(news);
		//
		
		// 뉴스의 각 url에서 content 부분 불러오는 부분
		for (NaverNewsVO content : news) {
			NaverNewsContentVO item = new NaverNews().getContentList(content.getLink());
			new NaverNewsViewer().newsContentViewer(item);
		}
		
	}
}
