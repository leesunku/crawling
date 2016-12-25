package naver.webtoon.viewer;

import java.util.List;

import naver.webtoon.model.Naver_Webtoon_weekday;

public class Naver_Webtoon_Viewer {

	public void weekdayWebtoonView(List<Naver_Webtoon_weekday> items){
		System.out.println("요일별 웹툰 리스트");
		System.out.println();			
		System.out.println("title\tartist\t\t\tscore\t\timgUrl");
		for (Naver_Webtoon_weekday item : items){	
			System.out.println(
				item.getTitle() + "\t" +
				item.getArtist() + "\t\t\t" +
				item.getStarScore() + "\t\t" +
				item.getImgUrl() + "\t\t\t" 
			);
		}
	}
}
