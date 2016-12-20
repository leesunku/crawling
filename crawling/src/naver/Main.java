package naver;

import java.util.List;

public class Main {
	
	private List<Item> realTimeKeywordList;
	
	public void getRealTimeKeyword(String url){
		
	}
	
	
	
	
}
class Item {
	private int rank;
	private String keyword;
	private int point;
	public Item() {
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
	public Item(int rank, String keyword, int point) {
		super();
		this.rank = rank;
		this.keyword = keyword;
		this.point = point;
	}		
}
