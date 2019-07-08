package com.empire.config;

import com.empire.model.Soldier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication(scanBasePackages = {"com.empire"})
@EnableDiscoveryClient
@EnableFeignClients
public class TroopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TroopsApplication.class);
	}

	@FeignClient(name = "soldier")
	public interface SoldierServiceClient {

		@RequestMapping(value = "/getSoldier", method = RequestMethod.GET)
		Soldier getSoldier();

	}

}
