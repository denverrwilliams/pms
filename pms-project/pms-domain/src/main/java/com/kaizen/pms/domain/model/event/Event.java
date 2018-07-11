package com.kaizen.pms.domain.model.event;

import java.util.Date;

import com.kaizen.pms.domain.enums.MoneyType;

public class Event {
	
	protected String eventName;
	protected Date startDate;
	protected Date endDate;

	protected MoneyType cost;
	
	public Event() {
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String name) {
		this.eventName = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public MoneyType getCost() {
		return cost;
	}

	public void setCost(MoneyType cost) {
		this.cost = cost;
	}
	
}
