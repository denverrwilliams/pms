package com.kaizen.pms.domain.model.event;

import java.util.Date;

import com.kaizen.pms.domain.EventType;
import com.kaizen.pms.domain.enums.MoneyType;

public class Event {
	
	public final static String EVENT_TYPE_SOCCER_SEASON     = "EventSoccerSeason";
	public final static String EVENT_TYPE_SOCCER_GAME       = "EventSoccerGame";
	public final static String EVENT_TYPE_SOCCER_TOURNAMENT = "EventSoccerTournament";
	public final static String EVENT_TYPE_SOCCER_CAMP       = "EventSoccerCamp";
	
	protected EventType type;
	protected String eventName;
	protected Date startDate;
	protected Date endDate;

	protected MoneyType cost;
	
	public Event(EventType type, String name, Date start, Date end) {
		this.type = type;
		this.eventName = name;
		this.startDate = start;
		this.endDate = end;
	}

	public String getEventName() {
		return eventName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public MoneyType getCost() {
		return cost;
	}

	public void setCost(MoneyType cost) {
		this.cost = cost;
	}
	
}
