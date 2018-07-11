package com.kaizen.pms.domain;

public enum PlayerGardianRelType {
	
	SON_OF(7000, "SON", "Son of Gardian"),
	DAUGHTER_OF(7001, "DAUGHTER", "Daughter of Gardian"),
	FATHER_OF(7002, "FATER", "Father of Player"),
	MOTHER_OF(7003, "MOTHER", "Mother of Player"),
	PHONE_UNKNOWN(5004, "PHONE_UNKNOWN", "Undefined Phone");

	private final int value;
	private final String text;
	private final String description;
	
	PlayerGardianRelType(int value, String text, String description) {
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
	public static PlayerGardianRelType fromString(String text) {
		
		PlayerGardianRelType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(PlayerGardianRelType elm : PlayerGardianRelType.values()) {
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
	public static PlayerGardianRelType fromValue(int value) {
		
		PlayerGardianRelType result = null;
		
		if( value > 0 ) {
			for(PlayerGardianRelType elm : PlayerGardianRelType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
