package naver.news.model;

public class NaverNewsVO {
	private String title; // 뉴스 제목
	private String link; //  뉴스 링크
	private String imgUrl; // 이미지 url
	private String writing; // 출처
	private String date; // 날짜
	private String summary; // 요약
	public NaverNewsVO() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getWriting() {
		return writing;
	}
	public void setWriting(String writing) {
		this.writing = writing;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public NaverNewsVO(String title, String link, String imgUrl, String writing, String date, String summary) {
		super();
		this.title = title;
		this.link = link;
		this.imgUrl = imgUrl;
		this.writing = writing;
		this.date = date;
		this.summary = summary;
	}
}
