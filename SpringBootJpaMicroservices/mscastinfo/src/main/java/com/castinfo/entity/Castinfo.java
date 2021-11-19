package com.castinfo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Castinfo {

	@Id
	public int castid;
	public String actor;
	public String actress;
	public int getCastid() {
		return castid;
	}
	public void setCastid(int castid) {
		this.castid = castid;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public Castinfo(int castid, String actor, String actress) {
		this.castid = castid;
		this.actor = actor;
		this.actress = actress;
	}
	
	public Castinfo() {
		 
	}
}
