package com.kaizen.pms.business.registration;

import com.kaizen.pms.domain.Accountability;
import com.kaizen.pms.domain.model.event.Registration;
import com.kaizen.pms.domain.model.event.ShoppingCart;

public class SeasonRegistrationFacade {
	
	
	public void performSeasonRegistration(Accountability accountability) {
		
		// validation
		
		// create season registration
		Registration reg = new Registration(accountability.getSoccerSeason().getEventId(), 
				accountability.getChild().getPartyId(), 
				accountability.getAccount().getAccountId());
		accountability.setRegistration(reg);
		
		// Add Soccer Season Event Line Item to Order
		// computer and update shopping cart balance
		ShoppingCart cart = new ShoppingCart();
		cart.addLineItem(accountability.getSoccerSeason());
		
		/*
		 * persist to database
		 */
		
		// generate invoice
	}
	
	public void processShoppingCart() {
		
		// get principal user name
		// retrieve shopping cart
		// process shopping cart
		// generate invoice
		
	}

}
