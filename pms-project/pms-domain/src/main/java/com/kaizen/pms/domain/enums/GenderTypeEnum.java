package com.kaizen.pms.domain.enums;

public enum GenderTypeEnum {
	
	MALE(4000, "MALE", "Male Gender"),
	FEMALE(4001, "FEMALE", "Female Gender"),
	GENDER_UNKNOWN(4002, "GENDER_UNKNOWN", "Undefined Gender");

	private final int value;
	private final String text;
	private final String description;
	
	GenderTypeEnum(int value, String text, String description) {
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
	public static GenderTypeEnum fromString(String text) {
		
		GenderTypeEnum result = null;
		
		if(text != null && !text.isEmpty()) {
			for(GenderTypeEnum elm : GenderTypeEnum.values()) {
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
	public static GenderTypeEnum fromValue(int value) {
		
		GenderTypeEnum result = null;
		
		if( value > 0 ) {
			for(GenderTypeEnum elm : GenderTypeEnum.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
