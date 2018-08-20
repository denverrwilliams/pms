package com.kaizen.pms.domain.enums;

public enum EmailTypeEnum {
	
	EMAIL_HOME(3000, "EMAIL_HOME", "Home Email Address"),
	EMAIL_WORK(3001, "EMAIL_WORK", "Work Email Address"),
	EAMIL_OTHER(3002, "EMAIL_OTHER", "Other Email Address"),
	EMAIL_UNKNOWN(3003, "EMAIL_UNKNOWN", "Undefined Email Address");

	private final int value;
	private final String text;
	private final String description;
	
	EmailTypeEnum(int value, String text, String description) {
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
	public static EmailTypeEnum fromString(String text) {
		
		EmailTypeEnum result = null;
		
		if(text != null && !text.isEmpty()) {
			for(EmailTypeEnum elm : EmailTypeEnum.values()) {
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
	public static EmailTypeEnum fromValue(int value) {
		
		EmailTypeEnum result = null;
		
		if( value > 0 ) {
			for(EmailTypeEnum elm : EmailTypeEnum.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
