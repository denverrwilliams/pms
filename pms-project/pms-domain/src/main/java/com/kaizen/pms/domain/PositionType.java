package com.kaizen.pms.domain;

public enum PositionType {
	
	POS_FORWARD(5000, "PHONE_HOME", "Phone Home"),
	POS_CENTER_FORWARD(5001, "PHONE_WORK", "Work Phone"),
	POS_MID_FLD(5002, "PHONE_MOBILE", "Mobile Phone"),
	POS_MID_FLD_ATTACKING(5003, "PHONE_OTHER", "Other Phone"),
	POS_MID_FLD_HOLDING(5003, "PHONE_OTHER", "Other Phone"),
	POS_DEFENDER(5003, "PHONE_OTHER", "Other Phone"),
	POS_DEFENDER_CENTER(5003, "PHONE_OTHER", "Other Phone"),
	POS_DEFENDER_LEFT(5003, "PHONE_OTHER", "Other Phone"),
	POS_DEFENDER_RIGHT(5003, "PHONE_OTHER", "Other Phone"),
	POS_WINGER(5003, "PHONE_OTHER", "Other Phone"),
	POS_WINGER_RIGHT(5003, "PHONE_OTHER", "Other Phone"),
	POS_WINGER_LEFT(5003, "PHONE_OTHER", "Other Phone"),
	POS_GOAL_KEEP(5003, "PHONE_OTHER", "Other Phone"),
	PHONE_UNKNOWN(5004, "PHONE_UNKNOWN", "Undefined Phone");

	private final int value;
	private final String text;
	private final String description;
	
	PositionType(int value, String text, String description) {
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
	public static PositionType fromString(String text) {
		
		PositionType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(PositionType elm : PositionType.values()) {
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
	public static PositionType fromValue(int value) {
		
		PositionType result = null;
		
		if( value > 0 ) {
			for(PositionType elm : PositionType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
