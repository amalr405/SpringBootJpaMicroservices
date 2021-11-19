package com.moviecatalog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviecatalog.entity.Castinfo;
import com.moviecatalog.entity.Mcmovies;
import com.moviecatalog.entity.Movieinfo;
//import com.moviecatalog.repository.Mcrepository;
import com.moviecatalog.service.Castinfoproxy;
import com.moviecatalog.service.Movieinfoproxy;

@RestController
@RequestMapping(value="/api/moviecatalog")
public class Mccontroller {
	
//	@Autowired
//	Mcrepository repo;
	
	@Autowired 
	public Movieinfoproxy mi;
	
	@Autowired
	public Castinfoproxy ci;
	
//	@PostMapping(value="/post")
//	public String postdata(@RequestBody Map<String,Object> mp) {
//		Mcmovies m = new Mcmovies();
//		m.setId((int) mp.get("id"));
//		m.setMovie((String) mp.get("movie"));
//		m.setRating((int) mp.get("rating"));
//		m.setDescription((String) mp.get("description"));
//		repo.save(m);
//		return "Successfully Entered Data";
//	}
	
	@GetMapping(value="/get",produces="application/json")
	public Mcmovies getdata() {
		Movieinfo minfo = mi.getdata();
		Castinfo cinfo = ci.getdata();
		return new Mcmovies(minfo,cinfo);
	}

}
