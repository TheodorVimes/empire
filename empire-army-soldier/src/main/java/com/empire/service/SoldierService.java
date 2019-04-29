package com.empire.service;

import com.empire.model.Soldier;
import com.empire.util.consts.MilitaryRank;

public interface SoldierService {

	Soldier get(MilitaryRank rank);

}
