package com.kaizen.pms.domain;

/**
 * 
 * @author Denver Williams
 * 
 */
public class Address {

	public final static String ADDR_TYPE_PERMAMENT    = "AddrPermament";
	public final static String ADDR_TYPE_MAILING      = "AddrMailing";
	public final static String ADDR_TYPE_ORGANIZATION = "AddrOrganization";
	public final static String ADDR_TYPE_WORK         = "AddrWork";
	public final static String ADDR_TYPE_HOME         = "AddrHome";
	
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	private AddressType addressType;
	
	/**
	 * Default Constructor
	 */
	public Address() {}
	
	private Address(AddressBuilder builder) {
		this.addressType = builder.addressType;
		
		this.street1 = builder.street1;
		this.street2 = builder.street2;
		this.city = builder.city;
		this.state = builder.state;
		this.zip = builder.zip;		
		this.country = builder.country;
	}
	
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public AddressType getAddressType() {
		return addressType;
	}

	/**
     * This method provides a stringified representation of the
     * Java object.
     * 
     */
    @Override
    public String toString() {

    	StringBuffer buffer = new StringBuffer();
    	
    	buffer.append("\nAddress Object [");
    	
    	buffer.append("\n   addressType = " + addressType);
    	buffer.append("\n   street1 = " + street1);
    	buffer.append("\n   street2 = " + street2);
    	buffer.append("\n   city = " + city);
    	buffer.append("\n   state = " + state);
    	buffer.append("\n   zip = " + zip);
    	buffer.append("\n   country = " + country);
    	
    	buffer.append(" ] End Address");
    		
    	return buffer.toString();
    }    
    
    public static class AddressBuilder {
    	private String street1;
    	private String street2;
    	private String city;
    	private String state;
    	private String zip;
    	private String country;
    	
    	private AddressType addressType;
    	    	
		public AddressBuilder(String type) { 
			this.addressType = new AddressType(type);
		}
		
		public AddressBuilder street1(String street1) {
			this.street1 = street1;
			return this;
		}
		public AddressBuilder street2(String street2) {
			this.street2 = street2;
			return this;
		}
		public AddressBuilder city(String city) {
			this.city = city;
			return this;
		}
		public AddressBuilder state(String state) {
			this.state = state;
			return this;
		}
		public AddressBuilder zip(String zip) {
			this.zip = zip;
			return this;
		}
		public AddressBuilder country(String country) {
			this.country = country;
			return this;
		}
		
		public Address build() {
			return new Address(this);
		}
	}
}
