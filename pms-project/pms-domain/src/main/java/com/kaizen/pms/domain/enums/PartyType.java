package com.kaizen.pms.domain.enums;

public enum PartyType {
	
	PARTY_PERSON(6000, "PARTY_PERSON", "Phone Home"),
	PARTY_ORGANIZATION(6001, "PARTY_ORGANIZATION", "Work Phone"),
	PART_UNKNOWN(6004, "PART_UNKNOWN", "Undefined Phone");

	private final int value;
	private final String text;
	private final String description;
	
	PartyType(int value, String text, String description) {
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
	public static PartyType fromString(String text) {
		
		PartyType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(PartyType elm : PartyType.values()) {
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
	public static PartyType fromValue(int value) {
		
		PartyType result = null;
		
		if( value > 0 ) {
			for(PartyType elm : PartyType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
