package com.kaizen.pms.domain.model.event;

import com.kaizen.pms.domain.Name;

public class GoalScorer {
	
	private Name name;
	private String teamName;
	private int timeScored;
	
	public GoalScorer() {
		
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTimeScored() {
		return timeScored;
	}

	public void setTimeScored(int timeScored) {
		this.timeScored = timeScored;
	}

}
