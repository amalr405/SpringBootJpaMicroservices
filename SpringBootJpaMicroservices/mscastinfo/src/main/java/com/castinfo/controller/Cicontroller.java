package com.castinfo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castinfo.entity.Castinfo;
import com.castinfo.repository.Cirepository;

@RestController
@RequestMapping(value="/castinfo")
public class Cicontroller {
	
	@Autowired
	Cirepository repo;
	
	@PostMapping(value="/post")
	public String postdata(@RequestBody Map<String,Object> mp) {
		Castinfo m = new Castinfo();
		m.setCastid((int) mp.get("castid"));
		m.setActor((String) mp.get("actor"));
		m.setActress((String) mp.get("actress"));
		repo.save(m);
		return "Successfully Entered Data";
	}
	
	@GetMapping(value="/get")
	public Castinfo getdata() {
		return repo.findById(1).get();
	}

	

}
