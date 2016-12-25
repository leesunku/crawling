package naver.webtoon.model;

public class Naver_Webtoon_weekday {
	private String imgUrl;
	private String title;
	private String artist;
	private float starScore;
	public Naver_Webtoon_weekday() {
		// TODO Auto-generated constructor stub
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public float getStarScore() {
		return starScore;
	}
	public void setStarScore(float starScore) {
		this.starScore = starScore;
	}
	public Naver_Webtoon_weekday(String imgUrl, String title, String artist, float starScore) {
		super();
		this.imgUrl = imgUrl;
		this.title = title;
		this.artist = artist;
		this.starScore = starScore;
	}
}
