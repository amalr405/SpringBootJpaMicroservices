package com.moviecatalog.entity;

 

 
public class Mcmovies {
	
//	@Id
//	public int id;
//	public String movie;
//	public int rating;
//	public String description;
	public Movieinfo movieinfo;
	public Castinfo castinfo;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getMovie() {
//		return movie;
//	}
//	public void setMovie(String movie) {
//		this.movie = movie;
//	}
//	public int getRating() {
//		return rating;
//	}
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	 
	public Mcmovies( Movieinfo movieinfo, Castinfo castinfo) {
//		this.id = id;
//		this.movie = movie;
//		this.rating = rating;
//		this.description = description;
		this.movieinfo = movieinfo;
		this.castinfo = castinfo;
	}
	public Movieinfo getMovieinfo() {
		return movieinfo;
	}
	public void setMovieinfo(Movieinfo movieinfo) {
		this.movieinfo = movieinfo;
	}
	public Castinfo getCastinfo() {
		return castinfo;
	}
	public void setCastinfo(Castinfo castinfo) {
		this.castinfo = castinfo;
	}
	public Mcmovies( ) {
	 
	}
	
}
