package com.kaizen.pms.domain.model.event;

import java.util.ArrayList;
import java.util.List;

public class Score {
	
	private int home;
	private int away;
	
	private List<GoalScorer> scorers = new ArrayList<GoalScorer>();
	
	public Score(int home, int away) {
		
		this.home = home;
		this.away = away;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public int getAway() {
		return away;
	}

	public void setAway(int away) {
		this.away = away;
	}

	public List<GoalScorer> getScorers() {
		return scorers;
	}

	public void setScorers(List<GoalScorer> scorers) {
		this.scorers = scorers;
	}
	

}
