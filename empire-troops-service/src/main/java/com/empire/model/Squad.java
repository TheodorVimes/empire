package com.empire.model;

import java.util.List;

public class Squad {

	private Soldier leader;
	private List<Soldier> members;

	public Soldier getLeader() {
		return leader;
	}

	public void setLeader(Soldier leader) {
		this.leader = leader;
	}

	@Override
	public String toString() {
		return "Squad{" +
			"leader=" + leader +
			", members=" + members +
			'}';
	}
}
