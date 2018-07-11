package com.kaizen.pms.domain;

public class Organization extends Party{

	protected String organizationName;
	
	/**
	 * Constructor with Parameters
	 * 
	 * @param organizationName is the name of the organization
	 */
	public Organization(String organizationName) {
		
		this.organizationName = organizationName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
}
