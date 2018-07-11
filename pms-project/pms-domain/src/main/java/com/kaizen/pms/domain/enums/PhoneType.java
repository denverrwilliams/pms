package com.kaizen.pms.domain.enums;

public enum PhoneType {
	
	PHONE_HOME(5000, "PHONE_HOME", "Phone Home"),
	PHONE_WORK(5001, "PHONE_WORK", "Work Phone"),
	PHONE_MOBILE(5002, "PHONE_MOBILE", "Mobile Phone"),
	PHONE_OTHER(5003, "PHONE_OTHER", "Other Phone"),
	PHONE_UNKNOWN(5004, "PHONE_UNKNOWN", "Undefined Phone");

	private final int value;
	private final String text;
	private final String description;
	
	PhoneType(int value, String text, String description) {
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
	public static PhoneType fromString(String text) {
		
		PhoneType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(PhoneType elm : PhoneType.values()) {
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
	public static PhoneType fromValue(int value) {
		
		PhoneType result = null;
		
		if( value > 0 ) {
			for(PhoneType elm : PhoneType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
