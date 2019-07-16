package com.empire.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.empire")
public class SoldierApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoldierApplication.class, args);
	}

}
