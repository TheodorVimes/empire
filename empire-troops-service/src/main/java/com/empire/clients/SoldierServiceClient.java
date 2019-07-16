package com.empire.clients;

import com.empire.model.Soldier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "soldier")
public interface SoldierServiceClient {

	@RequestMapping(value = "/getSoldier", method = RequestMethod.GET)
	Soldier getSoldier();

}
