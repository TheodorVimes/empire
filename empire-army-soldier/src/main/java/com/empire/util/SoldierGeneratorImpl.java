package com.empire.util;

import com.empire.model.Soldier;
import com.empire.util.consts.MilitaryRank;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class SoldierGeneratorImpl implements SoldierGenerator {

	private static final int BOUND = 99999;

	@Override
	public Soldier generate(MilitaryRank rank) {
		Soldier soldier = new Soldier();
		soldier.setName(generateName());
		soldier.setRank(rank);
		return soldier;
	}

	private String generateName() {
		return RandomStringUtils.random(2, true, false).toUpperCase()
			.concat("-").concat(String.valueOf(new Random().nextInt(BOUND)));
	}
}
