package naver.news.viewer;

import java.util.List;

import naver.news.model.NaverNewsContentVO;
import naver.news.model.NaverNewsVO;

public class NaverNewsViewer {
	public void newsViewer(List<NaverNewsVO> items){
		System.out.println("뉴스 리스트");
		System.out.println();			
		for (NaverNewsVO item : items){	
			System.out.println(
				"title = " + item.getTitle() + "\t writing = " + item.getWriting()
			);
			System.out.println(
				"summary = " + item.getSummary()
			);
			System.out.println(
				"date = " + item.getDate() + "\t link = " + item.getLink()
			);
			System.out.println(
				"imgUrl = " + item.getImgUrl()
			);
			System.out.println("----------------------------------------------------------------------");
		}
	}
	
	public void newsContentViewer(NaverNewsContentVO items){
		System.out.println("title : " + items.getTitle());
		System.out.println("date : " + items.getDate());
		System.out.println("content : " + items.getContent());
	}
}
