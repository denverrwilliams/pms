package com.kaizen.pms.domain;

public class AccountabilityType {
	
	/*public static final String ACCNT_TYP_REG_SEASON = "RegistrationSeason";
	public static final String ACCNT_TYP_REG_TOURNAMET = "RegistrationTournament";*/
	
	// Sample Accountability Types are "RegistrationSeason" and "RegistrationTournament"
	private String name;
	
	public AccountabilityType(String name) {
		this.name = name;
	}
	
	/*boolean canCreateAccountability(Party parent, Party child) {
		return areValidPartyTypes(parent, child);
	}*/

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountabilityType other = (AccountabilityType) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
