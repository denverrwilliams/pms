package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kaizen.pms.domain.enums.PartyTypeEnum;

public class Party {
	
	public final static String PARTY_TYPE_ORGANIZATION = "Organization";
	public final static String PARTY_TYPE_ORG_SOCCER_CLUB = "OrgSoccerClub";
	public final static String PARTY_TYPE_ORG_SOCCER_TEAM = "OrgSoccerTeam";
	public final static String PARTY_TYPE_ORG_SOCCER_LEAGUE = "OrgSoccerLeague";
	
	public final static String PARTY_TYPE_PERSON = "Person";
	public final static String PARTY_TYPE_PER_PLAYER = "PerPlayer";
	public final static String PARTY_TYPE_PER_PARENT = "PerParent";
	public final static String PARTY_TYPE_PER_GUARDIAN = "PerGuardian";
	
	protected Name name;
	protected PartyType partyType;
	protected List<Address> addresses = new ArrayList<Address>();	
	protected List<PhoneNumber> phones = new ArrayList<PhoneNumber>();
	protected List<EmailAddress> emails = new ArrayList<EmailAddress>();
	
	protected Set<Accountability> parentAccountabilities = new HashSet<Accountability>();
	protected Set<Accountability> childAccountabilities = new HashSet<Accountability>();
	
	/**
	 * Constructor with parameters
	 */
	public Party(Name name, PartyType type) {
		this.name = name;
		this.partyType = type;
	}
	
	public Set<Party> parents() {
		
		Set<Party> result = new HashSet<Party>();
		Iterator<Accountability> it = parentAccountabilities.iterator();
		while(it.hasNext()) {
			Accountability elm = (Accountability) it.next();
			result.add(elm.getParent());
		}
		
		return result;
	}
	
    public Set<Party> parents(AccountabilityType type) {
		
		Set<Party> result = new HashSet<Party>();
		Iterator<Accountability> it = parentAccountabilities.iterator();
		while(it.hasNext()) {
			Accountability elm = (Accountability) it.next();
			if(elm.getType().equals(type)) {
				result.add(elm.getParent());
			}
		}
		
		return result;
	}
	
    
	public Set<Party> children() {
		
		Set<Party> result = new HashSet<Party>();
		Iterator<Accountability> it = childAccountabilities.iterator();
		while(it.hasNext()) {
			Accountability elm = (Accountability) it.next();
			result.add(elm.getChild());
		}
		
		return result;
	}

	boolean ancestorsInclude(Party sample, AccountabilityType type) {
		
		Iterator<Party> it = parents(type).iterator();
		while (it.hasNext()) {
			Party elm = (Party) it.next();
			if (elm.equals(sample)) return true;
			if (elm.ancestorsInclude(sample, type)) return true;
		}
		return false;
	}
	
	public void addChildAccountabilty(Accountability arg) {
		childAccountabilities.add(arg);
	}
	
	public void addParentAccountabilty(Accountability arg) {
		parentAccountabilities.add(arg);
	}
	
	public Name getName() {
		return name;
	}

	public PartyType getPartyType() {
		return partyType;
	}
	
	public PartyType type() {
		return partyType;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
		
	public List<PhoneNumber> getPhones() {
		return phones;
	}
	
	public List<EmailAddress> getEmails() {
		return emails;
	}
	
}
