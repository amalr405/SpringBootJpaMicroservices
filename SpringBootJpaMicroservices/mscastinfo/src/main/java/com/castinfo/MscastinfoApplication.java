package com.castinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MscastinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscastinfoApplication.class, args);
	}

}
