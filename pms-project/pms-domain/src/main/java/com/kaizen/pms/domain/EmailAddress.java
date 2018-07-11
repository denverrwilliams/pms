package com.kaizen.pms.domain;

import com.kaizen.pms.domain.enums.EmailType;

public class EmailAddress {
	
	private String email;
	private EmailType type;

	/**
	 * Default Constructor
	 */
	public EmailAddress() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmailType getType() {
		return type;
	}

	public void setType(EmailType type) {
		this.type = type;
	}
	
}
