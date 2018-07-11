package com.kaizen.pms.domain.enums;

public enum AddressType {
	
	ADDR_HOME(6000, "ADDR_HOME", "Home Address"),
	ADDR_MAILING(6001, "ADDR_MAILING", "Mailing Address"),
	ADDR_ORG(6001, "ADDR_ORG", "Organization Address"),
	ADDR_UNKNOWN(6003, "ADDR_UNKNOWN", "Undefined Address");

	private final int value;
	private final String text;
	private final String description;
	
	AddressType(int value, String text, String description) {
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
	public static AddressType fromString(String text) {
		
		AddressType result = null;
		
		if(text != null && !text.isEmpty()) {
			for(AddressType elm : AddressType.values()) {
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
	public static AddressType fromValue(int value) {
		
		AddressType result = null;
		
		if( value > 0 ) {
			for(AddressType elm : AddressType.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
