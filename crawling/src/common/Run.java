package common;
import java.util.List;

import naver.main.Naver_getRealTimeKeyword;
import naver.main.model.Naver_realTimeKeyword;
import naver.main.viewer.Naver_Viewer;

public class Run {
	public static void main(String[] args) {
		Naver_getRealTimeKeyword getRealTimeKeys = new Naver_getRealTimeKeyword();
		String url = new Url().getRealTimeKeywords();
		List<Naver_realTimeKeyword> item = getRealTimeKeys.getRealTimeKeyword(url);
		new Naver_Viewer().realTimeKeywordView(item);

/*

	실시간 급상승 검색어
	
	rank	keyword			state		point			link
	1	최민희			상승		483			http://search.naver.com/search.naver?where=nexearch&query=%EC%B5%9C%EB%AF%BC%ED%9D%AC&sm=top_lve&ie=utf8			
	2	수요웹툰			상승		264			http://search.naver.com/search.naver?where=nexearch&query=%EC%88%98%EC%9A%94%EC%9B%B9%ED%88%B0&sm=top_lve&ie=utf8			
	3	화랑			상승		45			http://search.naver.com/search.naver?where=nexearch&query=%ED%99%94%EB%9E%91&sm=top_lve&ie=utf8			
	4	김보성			상승		99			http://search.naver.com/search.naver?where=nexearch&query=%EA%B9%80%EB%B3%B4%EC%84%B1&sm=top_lve&ie=utf8			
	5	휴면계좌통합조회			상승		30			http://search.naver.com/search.naver?where=nexearch&query=%ED%9C%B4%EB%A9%B4%EA%B3%84%EC%A2%8C%ED%86%B5%ED%95%A9%EC%A1%B0%ED%9A%8C&sm=top_lve&ie=utf8			
	6	낭만닥터 김사부			상승		33			http://search.naver.com/search.naver?where=nexearch&query=%EB%82%AD%EB%A7%8C%EB%8B%A5%ED%84%B0+%EA%B9%80%EC%82%AC%EB%B6%80&sm=top_lve&ie=utf8			
	7	마스터			상승		48			http://search.naver.com/search.naver?where=nexearch&query=%EB%A7%88%EC%8A%A4%ED%84%B0&sm=top_lve&ie=utf8			
	8	이제동			상승		195			http://search.naver.com/search.naver?where=nexearch&query=%EC%9D%B4%EC%A0%9C%EB%8F%99&sm=top_lve&ie=utf8			
	9	복학왕			상승		138			http://search.naver.com/search.naver?where=nexearch&query=%EB%B3%B5%ED%95%99%EC%99%95&sm=top_lve&ie=utf8			
	10	서현진			상승		84			http://search.naver.com/search.naver?where=nexearch&query=%EC%84%9C%ED%98%84%EC%A7%84&sm=top_lve&ie=utf8

*/
	}
}
