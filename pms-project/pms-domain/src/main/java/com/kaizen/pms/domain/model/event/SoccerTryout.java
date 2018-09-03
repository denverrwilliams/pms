package com.kaizen.pms.domain.model.event;

import java.util.Date;

import com.kaizen.pms.domain.EventType;

public class SoccerTryout extends Event {
	
	public SoccerTryout(EventType type, String name, String desc, Date start, Date end) {
		super(type, name, desc, start, end);
		
	}

	
}
