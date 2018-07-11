package com.kaizen.pms.domain.enums;

public enum EmailType {
	
	EMAIL_HOME(3000, "EMAIL_HOME", "Home Email Address"),
	EMAIL_WORK(3001, "EMAIL_WORK", "Work Email Address"),
	EAMIL_OTHER(3002, "EMAIL_OTHER", "Other Email Address"),
	EMAIL_UNKNOWN(3003, "EMAIL_UNKNOWN", "Undefined Email Address");

	private final int value;
	private final String text;
	private final String description;
	
	EmailType(int value, String text, String description) {
		this.value = value;
		this.text = text;
		this.description = description;
	}

	/**
	 * This accessor method retrieves the value of the enumeration.
	 * 
	 * @return the value of the enumeration.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * This accessor method retrieves the description of the enumeration.
	 * 
	 * @return the description of the enumeration
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This accessor method retrieves the text of the enumeration.
	 * 
	 * @return the text of the enumeration.
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * This method retrieves an enumeration corresponding to the input text.
	 * 
	 * @param text  of the enumeration to retrieve 
	 * @return      the enumeration corresponding to text
	 */
	public static EmailType fromString(String text) {
		
		EmailType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(EmailType elm : EmailType.values()) {
				if( text.equalsIgnoreCase(elm.text) ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method retrieves an enumeration corresponding to the input value.
	 * 
	 * @param value of the enumeration to retrieve 
	 * @return the enumeration corresponding to value
	 */
	public static EmailType fromValue(int value) {
		
		EmailType result = null;
		
		if( value > 0 ) {
			for(EmailType elm : EmailType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
