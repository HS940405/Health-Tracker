package com.example.healthtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class HealthTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthTrackerApplication.class, args);
	}

}
