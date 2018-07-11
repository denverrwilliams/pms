package com.kaizen.pms.domain;

public class School extends Organization {

	private String county;
	private String graduationYear;
	
	public School(String name) {
		super(name);
	}
	
	public School(String name, String county, String graduationYear) {
		super(name);
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}
	
}
