package com.moviecatalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.moviecatalog.entity.Castinfo;

@FeignClient(name="Castinfoproxy",url="http://localhost:5053")
public interface Castinfoproxy {
	
	@GetMapping(value="/castinfo/get")
	public Castinfo getdata();

}
