package com.kaizen.pms.domain;

public class Affiliation {
	private String state;
	private String organization;
	
	/**
	 * Default Constructor
	 */
	public Affiliation() {}
	
	public Affiliation(String state, String organization) {
		this.state = state;
		this.organization = organization;
	}
	
	public String getState() {
		return state;
	}
	
	public String getOrganization() {
		return organization;
	}

}
