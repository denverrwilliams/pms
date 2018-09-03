package com.kaizen.pms.domain;

import java.util.Date;

/**
 * Infraction class
 * 
 * @author Denver Williams
 *
 */
public class Infraction {
	
	private String gameId;
	private Date date;
	private String time;
	private String infractionType;
	private String description;
	private String homeTeam;
	private String awayTeam;
	private String club;
	private String season;
	private String league;
	
	public Infraction(InfractionBuilder builder) {
		
		this.gameId = builder.gameId;
		this.date = builder.date;
		this.time = builder.time;
		this.infractionType = builder.infractionType;
		this.description = builder.description;
		this.homeTeam = builder.homeTeam;
		this.awayTeam = builder.awayTeam;
		this.club = builder.club;
		this.season = builder.season;
		this.league = builder.league;
	}
	
	public String getGameId() {
		return gameId;
	}

	public Date getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getInfractionType() {
		return infractionType;
	}

	public String getDescription() {
		return description;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public String getClub() {
		return club;
	}

	public String getSeason() {
		return season;
	}

	public String getLeague() {
		return league;
	}

	/**
	 * Infraction builder
	 * 
	 */
	public static class InfractionBuilder {
		
		private String gameId;
		private Date date;
		private String time;
		private String infractionType;
		private String description;
		private String homeTeam;
		private String awayTeam;
		private String club;
		private String season;
		private String league;
		
		public InfractionBuilder(String gameId, String infractionType, Date date, String time) {
			
			this.gameId = gameId;
			this.infractionType = infractionType;
			this.date = date;
			this.time = time;
		}
		
		public InfractionBuilder gameId(String gameId) {			
			this.gameId = gameId;
			return this;
		}
		public InfractionBuilder date(Date date) {			
			this.date = date;
			return this;
		}
		public InfractionBuilder time(String time) {			
			this.time = time;
			return this;
		}		
		public InfractionBuilder infractionType(String infractionType) {			
			this.infractionType = infractionType;
			return this;
		}
		public InfractionBuilder description(String description) {			
			this.description = description;
			return this;
		}
		public InfractionBuilder homeTeam(String homeTeam) {			
			this.homeTeam = homeTeam;
			return this;
		}
		public InfractionBuilder awayTeam(String awayTeam) {			
			this.awayTeam = awayTeam;
			return this;
		}
		public InfractionBuilder club(String club) {			
			this.club = club;
			return this;
		}
		public InfractionBuilder season(String season) {			
			this.season = season;
			return this;
		}
		public InfractionBuilder league(String league) {			
			this.league = league;
			return this;
		}
		
		public Infraction build(){
			return new Infraction(this);
		}
	}

}
