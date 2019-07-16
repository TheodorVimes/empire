package com.empire.config;

import com.empire.filters.FarewellFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulConfig {

	public static void main(String[] args) {
		SpringApplication.run(ZuulConfig.class, args);
	}

	@Bean
	public FarewellFilter farewellFilter() {
		return new FarewellFilter();
	}
}
