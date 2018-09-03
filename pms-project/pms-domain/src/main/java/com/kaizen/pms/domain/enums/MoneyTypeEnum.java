package com.kaizen.pms.domain.enums;

public enum MoneyTypeEnum {
	
	MONEY_USD(9000, "MONEY_USD", "US Dollars"),
	MONEY_CAD(9001, "MONEY_CAD", "Canadian Dollars"),
	MONEY_BP(9001, "MONEY_BP", "British Pound"),
	MONEY_UNKNOWN(6003, "ADDR_UNKNOWN", "Undefined Address");

	private final int value;
	private final String text;
	private final String description;
	
	MoneyTypeEnum(int value, String text, String description) {
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
	public static MoneyTypeEnum fromString(String text) {
		
		MoneyTypeEnum result = null;
		
		if(text != null && !text.isEmpty()) {
			for(MoneyTypeEnum elm : MoneyTypeEnum.values()) {
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
	public static MoneyTypeEnum fromValue(int value) {
		
		MoneyTypeEnum result = null;
		
		if( value > 0 ) {
			for(MoneyTypeEnum elm : MoneyTypeEnum.values()) {
				if( value == elm.value ) {
					result = elm;
				}
			}
		}
		
		return result;
	}
}
