package com.revature.oca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GetScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetScoreApplication.class, args);
	}
}
