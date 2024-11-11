package com.example.UberReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberReviewApplication.class, args);
		System.out.println("uber review running ");
	}

}
