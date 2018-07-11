package com.kaizen.pms.domain.model.event;

import java.util.ArrayList;
import java.util.List;

public class SoccerSeason extends Event {
	
	private List<SoccerGame> games = new ArrayList<SoccerGame>();

	public List<SoccerGame> getGames() {
		return games;
	}

	public void setGames(List<SoccerGame> games) {
		this.games = games;
	}

	
}
