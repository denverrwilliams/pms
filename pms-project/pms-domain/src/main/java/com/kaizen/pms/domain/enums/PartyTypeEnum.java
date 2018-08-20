package com.kaizen.pms.domain.enums;

public enum PartyTypeEnum {
	
	PARTY_PERSON(6000, "PARTY_PERSON", "Phone Home"),
	PARTY_ORGANIZATION(6001, "PARTY_ORGANIZATION", "Work Phone"),
	PART_UNKNOWN(6004, "PART_UNKNOWN", "Undefined Phone");

	private final int value;
	private final String text;
	private final String description;
	
	PartyTypeEnum(int value, String text, String description) {
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
	public static PartyTypeEnum fromString(String text) {
		
		PartyTypeEnum result = null;
		
		if(text != null && !text.isEmpty()) {
			for(PartyTypeEnum elm : PartyTypeEnum.values()) {
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
	public static PartyTypeEnum fromValue(int value) {
		
		PartyTypeEnum result = null;
		
		if( value > 0 ) {
			for(PartyTypeEnum elm : PartyTypeEnum.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
