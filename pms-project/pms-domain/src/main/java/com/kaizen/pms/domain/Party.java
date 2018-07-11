package com.kaizen.pms.domain;

import java.util.List;

import com.kaizen.pms.domain.enums.PartyType;

public class Party {
	
	protected PartyType partyType;
	protected Address address;
	
	protected List<PhoneNumber> phones;
	protected List<EmailAddress> emails;
	
	/**
	 * Default Constructor
	 */
	public Party() {}
	
	public PartyType getPartyType() {
		return partyType;
	}

	public void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<PhoneNumber> getPhones() {
		return phones;
	}
	
	public void setPhones(List<PhoneNumber> phones) {
		this.phones = phones;
	}
	
	public List<EmailAddress> getEmails() {
		return emails;
	}
	
	public void setEmails(List<EmailAddress> emails) {
		this.emails = emails;
	}
	
}
