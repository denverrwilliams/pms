package com.kaizen.pms.domain.model.event;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private Money total = new Money();
	
	private List<Event> lineitems = new ArrayList<Event>();

	public ShoppingCart() {}
	
	public void addLineItem(Event lineitem) {
		if(lineitem != null) {
			lineitems.add(lineitem);
			
			total.add(lineitem.getPrice());
		}
	}

	public Money getTotal() {
		return total;
	}

	public List<Event> getLineitems() {
		return lineitems;
	}
	
}
