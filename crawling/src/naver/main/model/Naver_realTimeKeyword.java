package naver.main.model;

public class Naver_realTimeKeyword {
	private int rank;
	private String keyword;
	private String point;
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
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Naver_realTimeKeyword(int rank, String keyword, String point, String state, String link) {
		super();
		this.rank = rank;
		this.keyword = keyword;
		this.point = point;
		this.state = state;
		this.link = link;
	}
	
	
}
