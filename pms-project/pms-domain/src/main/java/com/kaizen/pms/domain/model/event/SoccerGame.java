package com.kaizen.pms.domain.model.event;

import java.util.Date;

import com.kaizen.pms.domain.EventType;
import com.kaizen.pms.domain.SoccerTeam;

public class SoccerGame extends Event {
	
	private SoccerTeam home;
	private SoccerTeam away;

	private Score score;
	
	public SoccerGame(EventType type, String name, Date start, Date end) {
		super(type, name, start, end);
		
	}

	

	public SoccerTeam getHome() {
		return home;
	}

	public void setHome(SoccerTeam home) {
		this.home = home;
	}

	public SoccerTeam getAway() {
		return away;
	}

	public void setAway(SoccerTeam away) {
		this.away = away;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
}
