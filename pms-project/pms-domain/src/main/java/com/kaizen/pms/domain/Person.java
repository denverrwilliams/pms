package com.kaizen.pms.domain;

import java.util.Date;

public class Person extends Party {
	
	public final static String GENDER_TYPE_FEMALE = "GenderFemale";
	public final static String GENDER_TYPE_MALE   = "GenderMale";
	
	protected GenderType gender;
	protected Date dateOfBirth;
	
	
	/**
	 * Constructor with parameters.
	 * 
	 * @param name
	 */
	public Person(Name name) {
		super(name, new PartyType(Party.PARTY_TYPE_PERSON));		
	}
	
	public Person(Name name, PartyType type) {
		super(name, type);		
	}
	
	public Person(Name name, GenderType gender, Date dob) {
		super(name, new PartyType(Party.PARTY_TYPE_PERSON));	
		
		this.gender = gender;
		this.dateOfBirth = dob;
	}
	
	public Person(Name name, PartyType type, GenderType gender, Date dob) {
		super(name, type);	
		
		this.gender = gender;
		this.dateOfBirth = dob;
	}
	

	public GenderType getGender() {
		return gender;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
}
