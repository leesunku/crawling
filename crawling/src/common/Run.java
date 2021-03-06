package common;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import naver.main.Naver_main;
import naver.main.model.Naver_realTimeKeyword;
import naver.main.viewer.Naver_Viewer;
import naver.webtoon.Naver_Webtoon;
import naver.webtoon.model.Naver_Webtoon_weekday;
import naver.webtoon.viewer.Naver_Webtoon_Viewer;

public class Run {
	public static void main(String[] args) {
		Naver_main getRealTimeKeys = new Naver_main();
		List<Naver_realTimeKeyword> item = getRealTimeKeys.getRealTimeKeyword();
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
/*
		Naver_main getRealTimeKeys = new Naver_main();
		List<Naver_realTimeKeyword> item = getRealTimeKeys.getRealTimeKeyword();
		new Naver_Viewer().realTimeKeywordView(item);

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

/*		

		Naver_Webtoon naverWeebtoons = new Naver_Webtoon();
		//week : mon tue wed thu fri sat sun
		String week = "tue";
		//orderType : Update ViewCount StarScore TitleName
		String orderType = "StarScore";
		List<Naver_Webtoon_weekday> items = naverWeebtoons.getWeekdayWebtoonList(week, orderType);
		new Naver_Webtoon_Viewer().weekdayWebtoonView(items);
		
요일별 웹툰 리스트

titleId	title	artist			score		imgUrl
650304	슈퍼 시크릿	이온			9.98		http://thumb.comic.naver.net/webtoon/650304/thumbnail/title_thumbnail_20150323144620_t83x90.jpg			
655744	오!주예수여	아현			9.98		http://thumb.comic.naver.net/webtoon/655744/thumbnail/title_thumbnail_20150601184016_t83x90.jpg			
686879	꿈꾸는 소녀,..	한경찰			9.97		http://thumb.comic.naver.net/webtoon/686879/thumbnail/title_thumbnail_20161025142411_t83x90.jpg			
626906	패밀리 사이즈	남지은 / 김인호			9.97		http://thumb.comic.naver.net/webtoon/626906/thumbnail/title_thumbnail_20150810235651_t83x90.jpg			
675554	가우스전자 시..	곽백수			9.97		http://thumb.comic.naver.net/webtoon/675554/thumbnail/title_thumbnail_20160303181701_t83x90.jpg			
675331	하이브3	김규삼			9.96		http://thumb.comic.naver.net/webtoon/675331/thumbnail/title_thumbnail_20160229184941_t83x90.jpg			
654817	미라클! 용사님	정하			9.96		http://thumb.comic.naver.net/webtoon/654817/thumbnail/title_thumbnail_20150514191647_t83x90.jpg			
676695	제로게임	즐바센			9.96		http://thumb.comic.naver.net/webtoon/676695/thumbnail/title_thumbnail_20160323171611_t83x90.jpg			
602287	신의 언어	장래혁			9.96		http://thumb.comic.naver.net/webtoon/602287/thumbnail/title_thumbnail_20150302193945_t83x90.jpg			
689705	완벽한 허니문	화류동풍 / 옛사람			9.95		http://thumb.comic.naver.net/webtoon/689705/thumbnail/title_thumbnail_20161212185807_t83x90.jpg			
686312	열정호구	솔뱅이			9.95		http://thumb.comic.naver.net/webtoon/686312/thumbnail/title_thumbnail_20161010182406_t83x90.jpg			
683496	신도림	오세형			9.94		http://thumb.comic.naver.net/webtoon/683496/thumbnail/title_thumbnail_20160805110206_t83x90.jpg			
682637	놓지마 정신줄..	신태훈 / 나승훈			9.94		http://thumb.comic.naver.net/webtoon/682637/thumbnail/title_thumbnail_20160729190602_t83x90.jpg			
616239	윌유메리미	마인드C			9.94		http://thumb.comic.naver.net/webtoon/616239/thumbnail/title_thumbnail_20161031214436_t83x90.jpg			
666670	모태솔로수용소..	5iAm			9.93		http://thumb.comic.naver.net/webtoon/666670/thumbnail/title_thumbnail_20151109202307_t83x90.jpg			
679569	차원이 다른 ..	요엔			9.93		http://thumb.comic.naver.net/webtoon/679569/thumbnail/title_thumbnail_20160606180504_t83x90.jpg			
686669	첩보의 별 시..	이상신 / 국중록			9.91		http://thumb.comic.naver.net/webtoon/686669/thumbnail/title_thumbnail_20161014154832_t83x90.jpg			
644180	하루 3컷	배진수			9.9		http://thumb.comic.naver.net/webtoon/644180/thumbnail/title_thumbnail_20141231175152_t83x90.jpg			
653344	기로	구들			9.9		http://thumb.comic.naver.net/webtoon/653344/thumbnail/title_thumbnail_20150420212358_t83x90.jpg			
677740	투명한 동거	정서			9.89		http://thumb.comic.naver.net/webtoon/677740/thumbnail/title_thumbnail_20160418160211_t83x90.jpg			
20853	마음의소리	조석			9.85		http://thumb.comic.naver.net/webtoon/20853/thumbnail/thumbnail_title_20853_83x90.gif			
25455	노블레스	손제호 / 이광수			9.84		http://thumb.comic.naver.net/webtoon/25455/thumbnail/title_thumbnail_20100614120245_t83x90.jpg			
400739	에이머	구동인			9.7		http://thumb.comic.naver.net/webtoon/400739/thumbnail/title_thumbnail_20150504175746_t83x90.jpg			
119874	덴마	양영순			9.6		http://thumb.comic.naver.net/webtoon/119874/thumbnail/title_thumbnail_20150706185233_t83x90.jpg			
679547	심연의 하늘 ..	윤인완 / 김선희			6.57		http://thumb.comic.naver.net/webtoon/679547/thumbnail/title_thumbnail_20160704144601_t83x90.jpg			
686911	공감.jpg	임총			3.49		http://thumb.comic.naver.net/webtoon/686911/thumbnail/title_thumbnail_20161017191626_t83x90.jpg			


*/
/*


		Naver_Webtoon content = new Naver_Webtoon();
		content.getWebtoonSingleContent("25455", 439, "tue");


http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_1.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_2.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_3.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_4.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_5.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_6.jpg
http://imgcomic.naver.net/webtoon/25455/439/20161219123044_0ae80029c07aef37dae5e37982fa110a_IMAG01_7.jpg
.......
웹툰 컨텐츠 url 리스트

*/