package naver.main.model;

public class Naver_realTimeKeyword {
	private int rank;
	private String keyword;
	private int point;
	private String state;
	private String link;
	public Naver_realTimeKeyword() {
		// TODO Auto-generated constructor stub
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Naver_realTimeKeyword(int rank, String keyword, int point, String state, String link) {
		super();
		this.rank = rank;
		this.keyword = keyword;
		this.point = point;
		this.state = state;
		this.link = link;
	}
	
}
