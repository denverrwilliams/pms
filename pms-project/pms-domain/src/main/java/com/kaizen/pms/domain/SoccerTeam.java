package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class SoccerTeam extends Organization {
	
	// required parameters
	private String ageGroup;
	// organization name is a required
	private SoccerLeague league;
	
	// optional parameters
	private String division;
	private String profilePicture;
	
	private List<SoccerCoach> coaches = new ArrayList<SoccerCoach>();
	private List<Player> roster = new ArrayList<Player>();
	
	public SoccerTeam(SoccerTeamBuilder builder) {
		
		super(builder.teamName);
		
		league = new SoccerLeague(builder.league);
		
		this.ageGroup = builder.ageGroup;
		
		// optional parameters
		this.division = builder.division;
		this.profilePicture = builder.profilePicture;
		
		if( !StringUtils.isEmpty(builder.coaches) ) {
			this.coaches.addAll( builder.coaches );
		}
		
		if( !StringUtils.isEmpty(builder.roster) ) {
			this.roster.addAll( builder.roster );
		}

	}
	
	public String getDivision() {
		return division;
	}

	public String getAgeGroup() {
		return ageGroup;
	}
	
	public String getTeamName() {
		return this.name.getOrganizationName();
	}
	
	public SoccerLeague getLeague() {
		return league;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public List<SoccerCoach> getCoaches() {
		return coaches;
	}
	
	public List<Player> getRoster() {
		return roster;
	}
	
	//Builder Class
	public static class SoccerTeamBuilder{

		// required parameters
		private String teamName;
		private String ageGroup;
		private String league;
		
		// optional parameters
		private String division;
		private String profilePicture;
		private List<SoccerCoach> coaches = new ArrayList<SoccerCoach>();
		private List<Player> roster = new ArrayList<Player>();

		/**
		 * Constructor with parameters
		 * 
		 * @param partyTyp
		 * @param teamName
		 * @param ageGroup
		 */
		public SoccerTeamBuilder(String teamName, String ageGroup, String league) {
			this.teamName = teamName;
			this.ageGroup = ageGroup;
			this.league = league;
		}
		
		public SoccerTeamBuilder division(String division) {
			this.division = division;
			return this;
		}
		
		public SoccerTeamBuilder profilePicture(String profilePicture) {
			this.profilePicture = profilePicture;
			return this;
		}

		public SoccerTeamBuilder coaches(List<SoccerCoach> coaches) {
			this.coaches = coaches;
			return this;
		}
		
		public SoccerTeamBuilder coache(SoccerCoach coach) {
			if(coach!=null) {
				this.coaches.add(coach);
			}
			return this;
		}
		
		public SoccerTeamBuilder roster(List<Player> roster) {
			if(roster!=null && !roster.isEmpty()) {
				this.roster.addAll(roster);
			}
			return this;
		}
		
		public SoccerTeamBuilder player(Player player) {			
			if(player != null) {
				this.roster.add(player);
			}
			return this;
		}
		
		public SoccerTeam build(){
			return new SoccerTeam(this);
		}
	}
}
