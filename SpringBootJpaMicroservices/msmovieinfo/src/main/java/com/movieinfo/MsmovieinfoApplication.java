package com.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsmovieinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsmovieinfoApplication.class, args);
	}

}
