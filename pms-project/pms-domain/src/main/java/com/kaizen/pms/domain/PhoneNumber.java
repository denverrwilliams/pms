package com.kaizen.pms.domain;

public class PhoneNumber {
	
	public final static String PHONE_TYPE_HOME   = "PhoneHome";
	public final static String PHONE_TYPE_MOBILE = "PhoneMobile";
	public final static String PHONE_TYPE_WORK   = "PhoneWork";
	public final static String PHONE_TYPE_OTHER  = "PhoneOther";
	
	
	private String areaCode;
	private String phoneNumber;
	private String country;
	private PhoneType phoneType;
	
	public PhoneNumber(String areaCode, String phoneNumber, String country) {
	
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.country = country;
		phoneType = new PhoneType(PHONE_TYPE_MOBILE);
	}
	public PhoneNumber(String areaCode, String phoneNumber,
				String country, PhoneType type) {
		
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.country = country;
		phoneType = type;
	}
	
	public PhoneNumber(String areaCode, String phoneNumber,
			String country, String type) {
	
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.country = country;
		phoneType = new PhoneType(type);
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public PhoneType getPhoneType() {
		return phoneType;
	}

}
