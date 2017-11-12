package com.example.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GetQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetQuestionApplication.class, args);
	}
}
