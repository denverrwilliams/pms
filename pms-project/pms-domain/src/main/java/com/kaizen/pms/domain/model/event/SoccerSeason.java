package com.kaizen.pms.domain.model.event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kaizen.pms.domain.EventType;

public class SoccerSeason extends Event {
	
	public SoccerSeason(EventType type, String name, Date start, Date end) {
		super(type, name, start, end);
		
	}

	private List<SoccerGame> games = new ArrayList<SoccerGame>();

	public List<SoccerGame> getGames() {
		return games;
	}

	public void setGames(List<SoccerGame> games) {
		this.games = games;
	}

	
}
