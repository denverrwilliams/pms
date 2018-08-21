package com.kaizen.pms.domain.model.event;

import java.util.Date;

import com.kaizen.pms.domain.EventType;
import com.kaizen.pms.domain.enums.MoneyType;

public class Event {
	
	public final static String EVENT_TYPE_SOCCER_SEASON     = "EventSoccerSeason";
	public final static String EVENT_TYPE_SOCCER_GAME       = "EventSoccerGame";
	public final static String EVENT_TYPE_SOCCER_TOURNAMENT = "EventSoccerTournament";
	public final static String EVENT_TYPE_SOCCER_CAMP       = "EventSoccerCamp";
	
	protected long eventId;
	public long getEventId() {
		return eventId;
	}

	protected EventType type;
	protected String eventName;
	protected String description;
	protected Date startDate;
	protected Date endDate;

	protected Money price;
	protected String sku;
	
	public Event(EventType type, String name, String desc, Date start, Date end) {
		this.type = type;
		this.eventName = name;
		this.startDate = start;
		this.endDate = end;
	}

	public String getEventName() {
		return eventName;
	}
	
	public String getDescription() {
		return description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
}
