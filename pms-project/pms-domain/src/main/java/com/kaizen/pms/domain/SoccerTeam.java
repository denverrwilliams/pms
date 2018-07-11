package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.List;

import com.kaizen.pms.domain.enums.PartyType;

public class SoccerTeam extends Organization {
	
	// required parameters
	private String ageGroup;
	
	// optional parameters
	private String division;
	private String profilePicture;
	
	private List<SoccerCoach> coaches = new ArrayList<SoccerCoach>();
	private List<Player> roster = new ArrayList<Player>();
	
	public SoccerTeam(SoccerTeamBuilder builder) {
		
		super(builder.orgname);
		
		this.partyType = builder.partyType;
		this.ageGroup = builder.ageGroup;
		
		// optional parameters
		this.division = builder.division;
		this.profilePicture = builder.profilePicture;
		this.coaches = builder.coaches;
	}
	
	public String getDivision() {
		return division;
	}

	public String getAgeGroup() {
		return ageGroup;
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
		private PartyType partyType;
		private String orgname;
		private String ageGroup;
		
		// optional parameters
		private String division;
		private String profilePicture;
		private List<SoccerCoach> coaches = new ArrayList<SoccerCoach>();
		private List<Player> roster = new ArrayList<Player>();

		/**
		 * Constructor with parameters
		 * 
		 * @param partyTyp
		 * @param orgname
		 * @param ageGroup
		 */
		public SoccerTeamBuilder(PartyType partyTyp, String orgname, String ageGroup) {
			this.partyType = partyTyp;
			this.orgname = orgname;
			this.ageGroup = ageGroup;
		}
		
		public SoccerTeamBuilder setDivision(String division) {
			this.division = division;
			return this;
		}
		
		public SoccerTeamBuilder setProfilePicture(String profilePicture) {
			this.profilePicture = profilePicture;
			return this;
		}

		public SoccerTeamBuilder setCoaches(List<SoccerCoach> coaches) {
			this.coaches = coaches;
			return this;
		}
		
		public SoccerTeamBuilder addCoache(SoccerCoach coach) {
			if(coach!=null) {
				this.coaches.add(coach);
			}
			return this;
		}
		
		public SoccerTeamBuilder setRoster(List<Player> roster) {
			this.roster = roster;
			return this;
		}
		
		public SoccerTeamBuilder addPlayer(Player player) {
			
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
