package common;

public class Url {
	public String getRealTimeKeywords() {
		return "http://www.naver.com/";
	}
	
	public String getWeekdayWebtoon(String week, String orderType) {
		return "http://comic.naver.com/webtoon/weekdayList.nhn?week=" + week + "&order=" + orderType + "&view=image";
	}
}
