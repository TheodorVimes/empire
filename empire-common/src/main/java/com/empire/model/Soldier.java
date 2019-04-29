package com.empire.model;

import com.empire.util.consts.MilitaryRank;

public class Soldier {

	private String name;
	private MilitaryRank rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MilitaryRank getRank() {
		return rank;
	}

	public void setRank(MilitaryRank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Soldier{" +
			"name='" + name + '\'' +
			", rank=" + rank +
			'}';
	}
}
