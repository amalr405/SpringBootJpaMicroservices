package com.moviecatalog.entity;

 
public class Movieinfo {
	
 
	public int movieid;
	public int year;
	public String certification;
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public Movieinfo(int movieid, int year, String certification) {
		this.movieid = movieid;
		this.year = year;
		this.certification = certification;
	}
	public Movieinfo() {
		 
	}
	public void setRating(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
