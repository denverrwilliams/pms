package com.kaizen.pms.domain;

import java.util.List;

public class Player extends Person {

	private String playerId;
	private String jerseyNumber;
	private String competitionLevel;
	private String registrationStatus;
	private Affiliation affiliation;
	private School school;
	private List<PlayerPosition> positions;
	private String profilePicture;

	
	public Player() {}
	
}
