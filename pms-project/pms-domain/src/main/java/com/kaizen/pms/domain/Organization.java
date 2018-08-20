package com.kaizen.pms.domain;

public class Organization extends Party {

	
	/**
	 * Constructor with Parameters
	 * 
	 * @param organizationName is the name of the organization
	 */
	public Organization(String organizationName) {
		
		super(new Name.NameBuilder().organizationName(organizationName).build(),
				new PartyType(Party.PARTY_TYPE_ORGANIZATION));
		
	}
	
	public Organization(String organizationName, PartyType type) {
		
		super(new Name.NameBuilder().organizationName(organizationName).build(), type);
		
	}

	public String getOrganizationName() {
		return this.name.getOrganizationName();
	}
	
}
