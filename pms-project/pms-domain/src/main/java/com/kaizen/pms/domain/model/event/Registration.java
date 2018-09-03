package com.kaizen.pms.domain.model.event;

public class Registration {
	
	private long registrationId;
	
	private long eventId;
	private long parentId;
	private long playerId;
	private long accountId;
	
	public Registration(long eventId, long parentId, long playerId, long accountId) {
		this.eventId = eventId;
		this.playerId = playerId;
		this.parentId = parentId;
		this.accountId = accountId;
	}

	public long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(long registrationId) {
		this.registrationId = registrationId;
	}

	public long getEventId() {
		return eventId;
	}

	public long getParentId() {
		return parentId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public long getAccountId() {
		return accountId;
	}

}
