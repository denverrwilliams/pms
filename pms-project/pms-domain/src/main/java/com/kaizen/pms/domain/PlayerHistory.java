package com.kaizen.pms.domain;

public class PlayerHistory {
	
	private String season;
	private String position;
	private String club;
	private String team;
	
	public PlayerHistory(String season, String position, 
				String club, String team) {
		
		this.season = season;
		this.position = position;
		this.club = club;
		this.team = team;
	}

	public String getSeason() {
		return season;
	}

	public String getPosition() {
		return position;
	}

	public String getClub() {
		return club;
	}

	public String getTeam() {
		return team;
	}

}
