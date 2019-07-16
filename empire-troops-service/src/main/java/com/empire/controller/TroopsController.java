package com.empire.controller;

import com.empire.model.Squad;
import com.empire.service.TroopsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TroopsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TroopsController.class);

	@Autowired
	private TroopsService troopsService;

	@GetMapping(value = "/getSquad", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Squad> getSquad() {
		LOGGER.info("Going for Troopers...");
		return ResponseEntity.ok(troopsService.createSquad());
	}

}
