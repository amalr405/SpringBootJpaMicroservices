package com.moviecatalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.moviecatalog.entity.Movieinfo;

@FeignClient(name="Movieinfoproxy",url="http://localhost:5052")
public interface Movieinfoproxy {
	
	@GetMapping(path="/movieinfo/get")
	public Movieinfo getdata();

}
