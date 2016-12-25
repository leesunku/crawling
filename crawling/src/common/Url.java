package common;

public class Url {
	public String getRealTimeKeywords() {
		return "http://www.naver.com/";
	}
	
	public String getWeekdayWebtoon(String week, String orderType) {
		return "http://comic.naver.com/webtoon/weekdayList.nhn?week=" + week + "&order=" + orderType + "&view=image";
	}
	public String getWebtoonSingleContent(String titleId, int no, String week){
		return "http://comic.naver.com/webtoon/detail.nhn?titleId=" + titleId + "&no=" + no + "&weekday=" + week;
	}
}
