package com.kaizen.pms.domain;

import com.kaizen.pms.domain.enums.PhoneType;

public class PhoneNumber {
	private String areaCode;
	private String phoneNumber;
	private String country;
	private PhoneType phoneType;
	
	public PhoneNumber(
			String areaCode,
			String phoneNumber,
			String country,
			PhoneType type) {
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.country = country;
		phoneType = type;
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
