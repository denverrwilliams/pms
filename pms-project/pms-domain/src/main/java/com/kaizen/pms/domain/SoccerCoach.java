package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.List;

import com.kaizen.pms.domain.enums.CoachType;

public class SoccerCoach extends Person {
	
	private CoachType coachType = CoachType.COACH_UNKNOWN;
	private List<SoccerTeam> assignedTeams = new ArrayList<SoccerTeam>();

	public SoccerCoach(CoachType coachType) {
		this.coachType = coachType;
	}

	public CoachType getCoachType() {
		return coachType;
	}
	
	public void assignTeam(SoccerTeam team) {
		if(team != null) {
			assignedTeams.add(team);
		}
	}
}
