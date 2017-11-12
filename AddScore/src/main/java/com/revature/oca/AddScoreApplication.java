package com.revature.oca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AddScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddScoreApplication.class, args);
	}
}
