package com.kaizen.pms.domain.model.event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kaizen.pms.domain.EventType;

public class SoccerSeason extends Event {
	
	private String ageGroup;
	private int maxRegistrationAllowed;
	private int minRegistrationAllowed;
	private int overBookedRegistrationCount;
	private int registrationCount;
	
	private List<SoccerGame> games = new ArrayList<SoccerGame>();
	
	public SoccerSeason(EventType type, String name, String desc, Date start, Date end) {
		super(type, name, desc, start, end);
		
	}
	
	public SoccerSeason(SoccerSeasonBuilder builder) {
		super(builder.eventType, builder.eventName, 
				builder.description, builder.startDate, builder.endDate);
		
		this.price = builder.price;
		this.sku = builder.sku;
		this.ageGroup = builder.ageGroup;
		this.maxRegistrationAllowed = builder.maxRegistrationAllowed;
		this.minRegistrationAllowed = builder.minRegistrationAllowed;
		this.overBookedRegistrationCount = builder.overBookedRegistrationCount;
		this.registrationCount = builder.registrationCount;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public int getMaxRegistrationAllowed() {
		return maxRegistrationAllowed;
	}

	public int getMinRegistrationAllowed() {
		return minRegistrationAllowed;
	}

	public int getOverBookedRegistrationCount() {
		return overBookedRegistrationCount;
	}

	public int getRegistrationCount() {
		return registrationCount;
	}

	public List<SoccerGame> getGames() {
		return games;
	}

	public void setGames(List<SoccerGame> games) {
		this.games = games;
	}

	
	// SoccerSeason Builder
	public static class SoccerSeasonBuilder {
		protected long eventId;

		private EventType eventType;
		private String eventName;
		private String description;
		private Date startDate;
		private Date endDate;

		private Money price;
		private String sku;
		
		private String ageGroup;
		private int maxRegistrationAllowed;
		private int minRegistrationAllowed;
		private int overBookedRegistrationCount;
		private int registrationCount;
		
		public SoccerSeasonBuilder() { }
		
		public SoccerSeasonBuilder(EventType type, String name, String desc, Date start, Date end) {
			this.eventType = type;
			this.eventName = name;
			this.description = desc;
			this.startDate = start;
			this.endDate = end;			
		}
		
		public SoccerSeasonBuilder price(Money price) {
			this.price = price;
			return this;
		}
		public SoccerSeasonBuilder sku(String sku) {
			this.sku = sku;
			return this;
		}
		public SoccerSeasonBuilder ageGroup(String ageGroup) {
			this.ageGroup = ageGroup;
			return this;
		}
		public SoccerSeasonBuilder maxRegistrationAllowed(int maxRegistrationAllowed) {
			this.maxRegistrationAllowed = maxRegistrationAllowed;
			return this;
		}
		public SoccerSeasonBuilder minRegistrationAllowed(int minRegistrationAllowed) {
			this.minRegistrationAllowed = minRegistrationAllowed;
			return this;
		}
		public SoccerSeasonBuilder overBookedRegistrationCount(int overBookedRegistrationCount) {
			this.overBookedRegistrationCount = overBookedRegistrationCount;
			return this;
		}
		public SoccerSeasonBuilder registrationCount(int registrationCount) {
			this.registrationCount = registrationCount;
			return this;
		}
		
		public SoccerSeason build() {
			return new SoccerSeason(this);
		}
	}
	
}
