package com.kaizen.pms.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.util.StringUtils;

public class ConnectionAccountabilityType extends AccountabilityType {
	
	private static Map<String, Set<ConnectionRule>> connectionRules = 
					new HashMap<String, Set<ConnectionRule>>();

	
	public static ConnectionAccountabilityType create(String name) {
		return new  ConnectionAccountabilityType(name);
	}
	
	public static void createAccountabilityRules(String name) {
		createRuleSet(name);
	}
	
	public ConnectionAccountabilityType(String name) {
		super(name);	
		//createRuleSet(name);
	}

	private static void createRuleSet(String name) {
		
		// A Parent or Guardian can register a Player into a Soccer Season
		// for a period of 1 year. The player is bounded to the Soccer Club for
		// 1 year.
		if(!StringUtils.isEmpty(name) && 
				Accountability.ACCNT_TYP_REG_SEASON.equalsIgnoreCase(name)) {
			
			PartyType parent = new PartyType(Party.PARTY_TYPE_PER_PARENT);
			PartyType guardian = new PartyType(Party.PARTY_TYPE_PER_GUARDIAN);
			PartyType player = new PartyType(Party.PARTY_TYPE_PER_PLAYER);
			
			addConnectionRule(name, parent, player);
			addConnectionRule(name, guardian, player);
		}
		else if(!StringUtils.isEmpty(name) && 
				Accountability.ACCNT_TYP_REG_SEASON.equalsIgnoreCase(name)) {
			
			PartyType parent = new PartyType(Party.PARTY_TYPE_PER_PARENT);
			PartyType guardian = new PartyType(Party.PARTY_TYPE_PER_GUARDIAN);
			PartyType player = new PartyType(Party.PARTY_TYPE_PER_PLAYER);
			
			addConnectionRule(name, parent, player);
			addConnectionRule(name, guardian, player);
		}
	}
	
	public static void addConnectionRule(String name, PartyType parent, PartyType child) {
		Set<ConnectionRule> rules;
		if((rules = connectionRules.get(name)) == null) {
			rules = new HashSet<ConnectionRule>();
			connectionRules.put(name, rules);
		}
		rules.add(new ConnectionRule(parent, child));
	}
	
	public boolean canCreateAccountability(Party parent, Party child) {
		return areValidPartyTypes(parent, child);
	}
	
	private boolean areValidPartyTypes(Party parent, Party child) {
		
		for (Map.Entry<String, Set<ConnectionRule>> entry : connectionRules.entrySet()) {
			
			Iterator<ConnectionRule> it =  entry.getValue().iterator();
			while (it.hasNext()) {
				ConnectionRule rule = it.next();
				if (rule.isValid(parent, child)) return true;
			}
			return false;
		}
		
		return false;
	}
}
