package com.empire.service;

import com.empire.model.Soldier;
import com.empire.util.SoldierGenerator;
import com.empire.util.consts.MilitaryRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoldierServiceImpl implements SoldierService {

	private SoldierGenerator generator;

	@Autowired
	public SoldierServiceImpl(SoldierGenerator generator) {
		this.generator = generator;
	}

	@Override
	public Soldier get(MilitaryRank rank) {
		return generator.generate(rank);
	}
}
