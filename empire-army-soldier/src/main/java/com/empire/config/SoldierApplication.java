package com.empire.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.empire")
@EnableDiscoveryClient
public class SoldierApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoldierApplication.class, args);
	}

}
