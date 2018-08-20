package com.kaizen.pms.domain;

public class Name {
	
	private String namePrefix;
	private String firstName;
	private String middleName;
	private String lastName;
	private String nameSuffix;
	
	private String organizationName;
	
	private Name(NameBuilder builder) {
		this.namePrefix = builder.namePrefix;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
		this.nameSuffix = builder.nameSuffix;
		
		this.organizationName = builder.organizationName;
	}
	
	public String getNamePrefix() {
		return namePrefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNameSuffix() {
		return nameSuffix;
	}
	
	public String getOrganizationName() {
		return organizationName;
	}

	public static class NameBuilder {
		private String namePrefix;
		private String firstName;
		private String middleName;
		private String lastName;
		private String nameSuffix;
		
		private String organizationName;
		
		public NameBuilder() { }
		
		public NameBuilder namePrefix(String namePrefix) {
			this.namePrefix = namePrefix;
			return this;
		}
		public NameBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public NameBuilder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		public NameBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public NameBuilder nameSuffix(String nameSuffix) {
			this.nameSuffix = nameSuffix;
			return this;
		}
		public NameBuilder organizationName(String organizationName) {
			this.organizationName = organizationName;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
	}
}
