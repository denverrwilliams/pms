package com.kaizen.pms.domain;

public class EmailAddress {
	
	public final static String EMAIL_TYPE_OTHER  = "EmailOther";
	public final static String EMAIL_TYPE_MOBILE = "EmailMobile";
	public final static String EMAIL_TYPE_WORK   = "EmailWork";
	public final static String EMAIL_TYPE_HOME   = "EmailHome";
	
	private String email;
	private EmailType type;

	public EmailAddress(String email) {
		this.type = new EmailType(EMAIL_TYPE_MOBILE);
		this.email = email;
	}
	
	public EmailAddress(EmailType type, String email) {
		this.type = type;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public EmailType getType() {
		return type;
	}
	
}
