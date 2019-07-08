package com.empire.util;

import com.empire.model.Soldier;
import com.empire.util.consts.MilitaryRank;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SoldierGeneratorImpl implements SoldierGenerator {

	private static final Logger LOGGER = LoggerFactory.getLogger(SoldierGeneratorImpl.class);

	private static final int BOUND = 99999;

	@Override
	public Soldier generate(MilitaryRank rank) {
		LOGGER.debug("STARTING TROOPER GENERATION");
		Soldier soldier = new Soldier();
		soldier.setName(generateName());
		soldier.setRank(rank);
		LOGGER.debug("TROOPER : {} . READY", soldier);
		return soldier;
	}

	private String generateName() {
		return RandomStringUtils.random(2, true, false).toUpperCase()
			.concat("-").concat(String.valueOf(new Random().nextInt(BOUND)));
	}
}
