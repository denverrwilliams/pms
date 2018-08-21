package com.kaizen.pms.domain.model.event;

public class Registration {
	
	private long registrationId;
	
	private long soccerSeasonEventId;
	private long playerId;
	private long accountId;
	
	public Registration(long soccerSeasonEventId, long playerId, long accountId) {
		this.soccerSeasonEventId = soccerSeasonEventId;
		this.playerId = playerId;
		this.accountId = accountId;
	}

	public long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(long registrationId) {
		this.registrationId = registrationId;
	}

	public long getSoccerSeasonEventId() {
		return soccerSeasonEventId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public long getAccountId() {
		return accountId;
	}

}
