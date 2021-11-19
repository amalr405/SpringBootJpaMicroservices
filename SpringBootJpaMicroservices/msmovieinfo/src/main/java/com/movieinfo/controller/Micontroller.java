package com.movieinfo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.entity.Movieinfo;
import com.movieinfo.repository.Mirepository;

 
@RestController
@RequestMapping(value="/movieinfo")
public class Micontroller {

	@Autowired
	Mirepository repo;
	
	@PostMapping(value="/post")
	public String postdata(@RequestBody Map<String,Object> mp) {
		Movieinfo m = new Movieinfo();
		m.setMovieid((int) mp.get("movieid"));
		m.setYear((int) mp.get("year"));
		m.setCertification((String) mp.get("certification"));
		repo.save(m);
		return "Successfully Entered Data";
	}
	
	@GetMapping(value="/get")
	public Movieinfo getdata() {
		return repo.findById(1).get();
	}

	
}
