package com.empire.service;

import com.empire.clients.SoldierServiceClient;
import com.empire.model.Squad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TroopsServiceImpl implements TroopsService {

	@Autowired
	private SoldierServiceClient client;

	public Squad createSquad() {
		Squad squad = new Squad();
		squad.setLeader(client.getSoldier());
		return squad;
	}

}
