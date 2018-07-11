package com.kaizen.pms.domain;

import com.kaizen.pms.domain.enums.AddressType;

/**
 * 
 * @author Denver
 * 
 *
 */
public class Address {

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
    	//buffer.append( super.toString() );
    	
    	buffer.append("\n   street1 = " + street1);
    	buffer.append("\n   street2 = " + street2);
    	buffer.append("\n   city = " + city);
    	buffer.append("\n   state = " + state);
    	buffer.append("\n   zip = " + zip);
    	buffer.append("\n   country = " + country);
    	

    	buffer.append(" ] End Address");
    		
    	return buffer.toString();
    }     
}
