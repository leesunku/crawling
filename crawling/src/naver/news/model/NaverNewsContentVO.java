package naver.news.model;

import java.util.List;

public class NaverNewsContentVO {
	private String title;
	private String content;
	private String date;
	private List<String> commentList;
	public NaverNewsContentVO() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<String> commentList) {
		this.commentList = commentList;
	}
	public NaverNewsContentVO(String title, String content, String date, List<String> commentList) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
		this.commentList = commentList;
	}
}
