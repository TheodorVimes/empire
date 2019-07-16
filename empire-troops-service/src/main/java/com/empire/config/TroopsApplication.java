package com.empire.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.empire"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.empire.clients")
public class TroopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TroopsApplication.class);
	}

}
