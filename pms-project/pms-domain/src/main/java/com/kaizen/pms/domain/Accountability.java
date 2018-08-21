package com.kaizen.pms.domain;

import com.kaizen.pms.domain.model.event.FamilyAccount;
import com.kaizen.pms.domain.model.event.Registration;
import com.kaizen.pms.domain.model.event.SoccerSeason;

/**
 * This construct allows us to capture relationships between a number of entities.
 * The actual Accountability Types determines the entities and nature of
 * relationships between them.
 * 
 * @author Denver
 *
 */
public class Accountability {
	
	public static final String ACCNT_TYP_REG_SEASON    = "AccntRegistrationSeason";
	public static final String ACCNT_TYP_REG_TOURNAMET = "AccntRegistrationTournament";

	private Party parent;
	private Party child;
	//private AccountabilityType type;
	private ConnectionAccountabilityType type;
	private SoccerSeason soccerSeason;
	private FamilyAccount account;
	private Registration registration;
	
	public FamilyAccount getAccount() {
		return account;
	}

	public static Accountability create(Party parent, Party child, ConnectionAccountabilityType type) {
		
		if(!canCreate(parent, child, type)) {
			throw new IllegalArgumentException("Invalid Accountability");
		}
		else {
			return new Accountability(parent, child, type);
		}
	}
	
	private Accountability(Party parent, Party child, ConnectionAccountabilityType type) {
		
		this.parent = parent;
		parent.addChildAccountabilty(this);
		this.child = child;
		child.addParentAccountabilty(this);
		this.type = type;
	}

	public Party getParent() {
		return parent;
	}

	public Party getChild() {
		return child;
	}

	public AccountabilityType getType() {
		return type;
	}
	
	private static boolean canCreate(Party parent, Party child, ConnectionAccountabilityType type) {
		
		if (parent.equals(child)) {
			return false;
		}
		if (parent.ancestorsInclude(child, type)) {
			return false;
		}
		
		return type.canCreateAccountability(parent, child);
	}

	public SoccerSeason getSoccerSeason() {
		return soccerSeason;
	}

	public void setSoccerSeason(SoccerSeason soccerSeason) {
		this.soccerSeason = soccerSeason;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
}
