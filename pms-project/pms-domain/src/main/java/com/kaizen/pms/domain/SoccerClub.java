package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.List;

import com.kaizen.pms.domain.model.event.SoccerSeason;

public class SoccerClub extends Organization {
	
	private List<SoccerSeason> seasonRegistrations = new ArrayList<>();
	
	
	public SoccerClub(String clubName) {
		
		super(clubName, new PartyType(Party.PARTY_TYPE_ORG_SOCCER_CLUB));
	}
	
	public SoccerClub(String clubName, PartyType type) {
		
		super(clubName, type);
	}
	
	
	public String getClubName() {
		return this.name.getOrganizationName();
	}
	

	public List<SoccerSeason> getSeasonRegistrations() {
		return seasonRegistrations;
	}

	public void setSeasonRegistrations(List<SoccerSeason> seasonRegistrations) {
		
		if(seasonRegistrations!=null && !seasonRegistrations.isEmpty()) {
			this.seasonRegistrations.addAll(seasonRegistrations);
		}
	}
	
	public void addSeasonRegistration(SoccerSeason soccerSeason) {
		
		if(soccerSeason!=null) {
			seasonRegistrations.add(soccerSeason);
		}
	}
}
