package com.kaizen.pms.domain.enums;

public enum CoachType {
	
	COACH_HEAD(7000, "COACH_HEAD", "Head Coach"),
	COACH_ASSISTANT(7001, "COACH_ASSISTANT", "Assistant Coach"),
	COACH_UNKNOWN(7004, "COACH_UNKNOWN", "Undefined Coach");

	private final int value;
	private final String text;
	private final String description;
	
	CoachType(int value, String text, String description) {
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
	public static CoachType fromString(String text) {
		
		CoachType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(CoachType elm : CoachType.values()) {
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
	public static CoachType fromValue(int value) {
		
		CoachType result = null;
		
		if( value > 0 ) {
			for(CoachType elm : CoachType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
