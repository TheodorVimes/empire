package com.empire.util;

import com.empire.model.Soldier;
import com.empire.util.consts.MilitaryRank;

public interface SoldierGenerator {

	Soldier generate(MilitaryRank rank);

}
