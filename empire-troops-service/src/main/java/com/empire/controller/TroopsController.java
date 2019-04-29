package com.empire.controller;

import com.empire.model.Squad;
import com.empire.service.TroopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TroopsController {

	@Autowired
	private TroopsService troopsService;

	@GetMapping(value = "/getSquad", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Squad> getSquad() {
		System.out.println("Going for Troopers...");
		return ResponseEntity.ok(troopsService.createSquad());
	}

}
