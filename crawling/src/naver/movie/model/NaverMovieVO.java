package naver.movie.model;

public class NaverMovieVO {
	private String title;
	private String imgUrl;
	private String director;
	private String actor;
	private String date;
	private String genre;
	private String grade;
	public NaverMovieVO() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public NaverMovieVO(String title, String imgUrl, String director, String actor, String date, String genre,
			String grade) {
		super();
		this.title = title;
		this.imgUrl = imgUrl;
		this.director = director;
		this.actor = actor;
		this.date = date;
		this.genre = genre;
		this.grade = grade;
	}
}
