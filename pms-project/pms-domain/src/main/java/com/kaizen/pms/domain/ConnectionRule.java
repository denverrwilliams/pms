package com.kaizen.pms.domain;

public class ConnectionRule {

	private PartyType allowedParent;
	private PartyType allowedChild;
	
	public ConnectionRule(PartyType parent, PartyType child) {
		this.allowedParent = parent;
		this.allowedChild = child;
	}
	
	boolean isValid (Party parent, Party child) {
		return (parent.type().equals(allowedParent) && child.type().equals(allowedChild));
	}

	public PartyType getAllowedParent() {
		return allowedParent;
	}

	public PartyType getAllowedChild() {
		return allowedChild;
	}
	
}
