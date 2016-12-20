package naver.main.viewer;

import java.util.List;

import naver.main.model.Naver_realTimeKeyword;

public class Naver_Viewer {
	public void realTimeKeywordView(List<Naver_realTimeKeyword> items){
		System.out.println("실시간 급상승 검색어");
		System.out.println();			
		System.out.println("rank\tkeyword\t\t\tstate\t\tpoint\t\t\tlink");
		for (Naver_realTimeKeyword item : items){	
			System.out.println(
				item.getRank() + "\t" +
				item.getKeyword() + "\t\t\t" +
				item.getState() + "\t\t" +
				item.getPoint() + "\t\t\t" +
				item.getLink() + "\t\t\t"
			);
		}
	}
}
