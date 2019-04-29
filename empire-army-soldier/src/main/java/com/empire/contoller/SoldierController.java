package com.empire.contoller;

import com.empire.model.Soldier;
import com.empire.service.SoldierService;
import com.empire.util.consts.MilitaryRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoldierController {

	@Autowired
	private SoldierService soldierService;

	@GetMapping(value = "/getSoldier", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Soldier> getSoldier() {
		Soldier soldier = soldierService.get(MilitaryRank.PRIVATE);
		return ResponseEntity.ok(soldier);
	}

}
