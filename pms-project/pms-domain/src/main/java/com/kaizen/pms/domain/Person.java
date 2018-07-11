package com.kaizen.pms.domain;

import java.util.Date;

import com.kaizen.pms.domain.enums.GenderType;

public class Person extends Party{
	
	// comment
	protected Name name;
	protected GenderType gender;
	protected Date dateOfBirth;
	
	
	/**
	 * Default Constructor
	 */
	public Person() {}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
