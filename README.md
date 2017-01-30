# 네이버, 다음 등등 한국 사이트 크롤링

### java 버전
> 1.7

### 사용법
> crawling/jar  내의 jar파일을 받아서 아래의 예제를 응용하면 됩니다

### 개발된 기능
> crawling_korean_page_0_0_1.jar
> > naver 실시간 급상승 검색어(2016-12-20)

> > naver 요일별 웹툰 리스트(2016-12-25) 

> > naver 실시간 뉴스 url(2017-01-17> > naver 요일별 웹툰 리스트(2016-12-25) 

> > naver 실시간 뉴스 url의 컨텐츠(2017-01-17

### 클래스 & 메소드

> Class : ```Naver_Main```
> > naver 메인페이지에서 크롤링 할 메소드들을 정의한 클래스이다.

> > Method : ```getRealTimeKeyword```
> > > naver 실시간 급상승 검색어
> > > > Input : 

> > > > Output : 
> > > > > ```int rank;``` // 순위

> > > > > ```String keyword;``` // 키워드

> > > > > ```int point;``` // 수치

> > > > > ```String state;``` //상태 : 상승, 하락, 신규

> > > > > ```String link;``` // 검색 결과 url

> > > > Return Class : ```List<Naver_realTimeKeyword>```



> Class : ```Naver_Webtoon```
> > naver 웹툰페이지에서 크롤링 할 메소드들을 정의한 클래스이다.

> > Method : ```getWeekdayWebtoonList```
> > > naver 주간 웹툰 리스트
> > > > Input : 
> > > > > ```String week;``` // 요일 : mon tue wed thu fri sat sun

> > > > > ```String orderType;``` // 정렬기준 : Update ViewCount StarScore TitleName

> > > > Output : 

> > > > > ```String imgUrl;``` // 웹툰 이미지 url

> > > > > ```String title;``` // 웹툰 제목

> > > > > ```String artist;``` // 웹툰 작가

> > > > > ```float starScore;``` // 웹툰 평점

> > > > > ```int titleId;``` // 웹툰 id

> > > > Return Class : ```List<Naver_Webtoon_weekday>```

> Class : ```NaverNews```
> > naver 뉴스페이지에서 크롤링 할 메소드들을 정의한 클래스이다.

> > Method : ```getNewsList```
> > > naver 주간 웹툰 리스트
> > > > Input : 
> > > > > ```String sid;``` // 요일 : sid = 001-속보, 100-정치, 101-경제, 102-사회, 104-생활/문화, 105-세계, 106-IT/과학, 107-연예, ... 상단 카테고리

> > > > > ```String listType;``` // 리턴리스트타입 : listType =  = title 제목별로 보기, summary = 요약별로 보기, photo = 이미지만 보기

> > > > > ```String date;``` // 날짜 : "20170131"

> > > > > ```int page;``` // 페이지 : 1,2,3,4,...

> > > > Output : 

> > > > > ```String title;``` // 뉴스 제목

> > > > > ```String link;``` // 뉴스 링크

> > > > > ```String imgUrl;``` // 이미지 url(있을경우, photo 리턴)

> > > > > ```String writing;``` // 출처

> > > > > ```String date;``` // 날짜

> > > > > ```String summary;``` // 요약

> > > > Return Class : ```List<NaverNewsVO>```

> > Method : ```getContentList```
> > > naver 주간 웹툰 리스트
> > > > Input : 
> > > > > ```String url;``` // 뉴스url : url

> > > > Output : 

> > > > > ```String title;``` // 뉴스 제목

> > > > > ```String content;``` // 뉴스 콘텐츠

> > > > > ```String date;``` // 날짜

> > > > Return Class : ```List<NaverNewsContentVO>```

### 예제
> naver 실시간 급상승 검색어
>	> 실행코드

> >```
> >Naver_main getRealTimeKeys = new Naver_main();
> >List<Naver_realTimeKeyword> item = getRealTimeKeys.getRealTimeKeyword();
> >new Naver_Viewer().realTimeKeywordView(item);
> >```

>	> 결과
> >```
> >rank	keyword			state		point			link
> >1	최민희			상승		483			http://search.naver.com/search.naver?where=nexearch&query=%EC%B5%9C%EB%AF%BC%ED%9D%AC&sm=top_lve&ie=utf8			
> >2	수요웹툰			상승		264			http://search.naver.com/search.naver?where=nexearch&query=%EC%88%98%EC%9A%94%EC%9B%B9%ED%88%B0&sm=top_lve&ie=utf8			
> >3	화랑			상승		45			http://search.naver.com/search.naver?where=nexearch&query=%ED%99%94%EB%9E%91&sm=top_lve&ie=utf8			
> >4	김보성			상승		99			http://search.naver.com/search.naver?where=nexearch&query=%EA%B9%80%EB%B3%B4%EC%84%B1&sm=top_lve&ie=utf8			
> >5	휴면계좌통합조회			상승		30			http://search.naver.com/search.naver?where=nexearch&query=%ED%9C%B4%EB%A9%B4%EA%B3%84%EC%A2%8C%ED%86%B5%ED%95%A9%EC%A1%B0%ED%9A%8C&sm=top_lve&ie=utf8			
> >6	낭만닥터 김사부			상승		33			http://search.naver.com/search.naver?where=nexearch&query=%EB%82%AD%EB%A7%8C%EB%8B%A5%ED%84%B0+%EA%B9%80%EC%82%AC%EB%B6%80&sm=top_lve&ie=utf8			
> >7	마스터			상승		48			http://search.naver.com/search.naver?where=nexearch&query=%EB%A7%88%EC%8A%A4%ED%84%B0&sm=top_lve&ie=utf8			
> >8	이제동			상승		195			http://search.naver.com/search.naver?where=nexearch&query=%EC%9D%B4%EC%A0%9C%EB%8F%99&sm=top_lve&ie=utf8			
> >9	복학왕			상승		138			http://search.naver.com/search.naver?where=nexearch&query=%EB%B3%B5%ED%95%99%EC%99%95&sm=top_lve&ie=utf8			
> >10	서현진			상승		84			http://search.naver.com/search.naver?where=nexearch&query=%EC%84%9C%ED%98%84%EC%A7%84&sm=top_lve&ie=utf8

> >```

>  naver 요일별 웹툰 리스트

> > 실행코드
> >```

> > Naver_Webtoon naverWeebtoons = new Naver_Webtoon();
> > //week : mon tue wed thu fri sat sun
> > String week = "tue";
> > //orderType : Update ViewCount StarScore TitleName
> > String orderType = "StarScore";
> > List<Naver_Webtoon_weekday> items = naverWeebtoons.getWeekdayWebtoonList(week, orderType);
> > new Naver_Webtoon_Viewer().weekdayWebtoonView(items);

> >```
> > 결과
> >```
> >titleId	title	artist			score		imgUrl
> >650304	슈퍼 시크릿	이온			9.98		http://thumb.comic.naver.net/webtoon/650304/thumbnail/title_thumbnail_20150323144620_t83x90.jpg	
> >655744	오!주예수여	아현			9.98		http://thumb.comic.naver.net/webtoon/655744/thumbnail/title_thumbnail_20150601184016_t83x90.jpg	
> >675554	가우스전자 시..	곽백수			9.97		http://thumb.comic.naver.net/webtoon/675554/thumbnail/title_thumbnail_20160303181701_t83x90.jpg			
> >...
> >...
> >```

> > 실행코드
> >```

> >		List<NaverNewsVO> news = new NaverNews().getNewsList("106", "photo", "20170115", 1);
> >		//new NaverNewsViewer().newsViewer(news);
> >		// 뉴스의 각 url에서 content 부분 불러오는 부분
> >		for (NaverNewsVO content : news) {
> >			NaverNewsContentVO item = new NaverNews().getContentList(content.getLink());
> >			new NaverNewsViewer().newsContentViewer(item);
> >		}
> >```
> > 결과
> >```
> >title : ‘문제적 남자’ 수능만점자 이영래, 전소미와 영상통화···“남자 연예인 조심해” 개별 기사의 섹션 정보는 해당 언론사의 분류를 따르고 있습니다.
> >date : 2017.01.15 오후 11:50
> >content : ‘문제적 남자’ 수능 만점자 이영래군이 IOI 전소미와 영상통화를 했다. 15일 방송된 tvN ‘뇌섹시대-문제적 남자’에서는 2017년 수능 만점자 김재경, 이영래 군이 출연했다. 이날 이영래 군은 “공부 스트레스를 어떻게 푸느냐?”는 질문에 “전소미를 정말 좋아한다”고 밝혔다. 이에 제작진은 이영래 군이 전소미와 영상통화를 할 수 있는 시간을 제공했다. 전현무는 “전소미 양을 너무너무너무 좋아하는 친구가 있다. 대단히 똑똑한 분”이라며 이영래 군을 소개했다. 이에 전소미는 “저 그 분 알아요. 영래 씨 아닌가?”라며 “영래 오빠 파이팅”이라고 외쳤다. 이영래 군은 “IOI 끝나도 JYP에서 꼭 성공해서 멋진 가수 되길 바랄게”라며 “일단 주위에 남자 연예인 조심하고”라고 말해 웃음을 자아냈다. [사진=tvN ‘뇌섹시대-문제적 남자’ 방송화면캡처] /전종선기자 jjs7377@sedaily.com [서울경제 바로가기] 나와 찰떡 궁합인 대선 후보는? [설문 바로가기] 서울경제와 친해지는 가장 확실한 방법 [페이스북] 저작권자 ⓒ 서울경제, 무단 전재 및 재배포 금지
> >title : [신서유기3 동영상] 은지원, 40년동안 요강을 '요광'으로 알고있었어요 개별 기사의 섹션 정보는 해당 언론사의 분류를 따르고 있습니다.
> >date : 2017.01.15 오후 11:46
> >content : [enews24 전수미 기자] 은지원이 40년 인생을 잃어버렸다? 15일 밤 방송된 tvN '신서유기3'에서는 멤버들이 사물퀴즈를 하는 모습이 그려졌다. 이날 은지원은 요강 사진을 보고 "요광" "요강"이라고 자신있게 외쳤다. 육성으로는 정답처럼 들렸다. 하지만 예민한 나영석PD가 귀를 의심했고, 은지원에게 정답을 글자로 적어보라고 했다. 그 후 은지원은 자신만만하게 '요광'이라고 쓰며 모두를 놀라게 했다. 은지원은 "난 40년 동안 요광으로 알고 있었다. 소름"이라고 분노하며 더 큰 웃음을 선사했다. 전수미 기자 jun@enews24.net [Copyright ⓒ Asia No.1 연예뉴스 enews24.net 무단전재 및 재배포 금지]
> >...
> >...
> >```



### 업데이트 예정

> 다음 웹툰 리스트

> 다음 웹툰 수집


### 라이센스 & 작성자

> 라이센스
> > 공부를 위한 목적으로 만들었으며, 크롤링에 관심 있는 분들이 참고용으로 사용하면 좋겠습니다. 소스코드는 자유롭게 사용 가능합니다만, 무단으로 재배포 및 게시는 자제해주시기 바랍니다.

> > 과도한 크롤링은 대량의 트래픽 발생 및 포털회사에 피해를 줄 수 있습니다.

> 작성자
> > tjsrn0524@naver.com

