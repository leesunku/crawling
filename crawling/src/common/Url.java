package common;

public class Url {
	public String getRealTimeKeywords() {
		return "http://www.naver.com/";
	}
	
	public String getNewsUrl(String sid, String listType, String date, int page){
		return "http://news.naver.com/main/list.nhn?sid1=" + sid + "&listType=" + listType + "&mid=sec&mode=LSD&date=" + date + "&page=" + page;
	}
	
	public String getWeekdayWebtoon(String week, String orderType) {
		return "http://comic.naver.com/webtoon/weekdayList.nhn?week=" + week + "&order=" + orderType + "&view=image";
	}
	public String getWebtoonSingleContent(String titleId, int no, String week){
		return "http://comic.naver.com/webtoon/detail.nhn?titleId=" + titleId + "&no=" + no + "&weekday=" + week;
	}
	
	public String getNaverMovie(String tab, String order){
		return "http://movie.naver.com/movie/running/current.nhn?view=list&tab=" + tab + "&order=" + order;
	}
}
