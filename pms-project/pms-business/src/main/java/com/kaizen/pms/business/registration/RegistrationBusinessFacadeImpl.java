package com.kaizen.pms.business.registration;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Autowired;

import com.kaizen.pms.business.invoice.InvoiceBusinessFacadeImpl;
import com.kaizen.pms.domain.Accountability;
import com.kaizen.pms.domain.model.event.Event;
import com.kaizen.pms.domain.model.event.Registration;
import com.kaizen.pms.domain.model.event.ShoppingCart;
import com.kaizen.pms.domain.model.invoice.Invoice;

public class RegistrationBusinessFacadeImpl implements RegistrationBusinessFacade {
	
	private InvoiceBusinessFacadeImpl invoiceBusinessFacade;
	
	@Autowired
	public RegistrationBusinessFacadeImpl(InvoiceBusinessFacadeImpl invoiceBusinessFacade) {
		this.invoiceBusinessFacade = invoiceBusinessFacade;
	}
	
	@Override
	public void performSeasonRegistration(Accountability accountability) {
		
		// validation
		if ( !Accountability.ACCNT_TYP_REG_SEASON.
					equalsIgnoreCase(accountability.getType().getName()) ) {
			throw new InvalidParameterException("Invlid Accountability Type");
		}
		if( !Event.EVENT_TYPE_SOCCER_SEASON.equalsIgnoreCase(
				accountability.getEvent().getEventName()) ) {
			throw new InvalidParameterException("Invlid Event Type");
		}
		
		// create season registration
		Registration reg = new Registration(accountability.getEvent().getEventId(), 
				accountability.getParent().getPartyId(),
				accountability.getChild().getPartyId(), 
				accountability.getAccount().getAccountId());
		accountability.setRegistration(reg);
		
		// Add Soccer Season Event Line Item to Shopping Cart
		// computer and update shopping cart balance
		ShoppingCart cart = new ShoppingCart();
		cart.addLineItem(accountability.getEvent());
		
		// Persist to database
		// Persist Accountability including registration
		// Persist Shopping Cart
		
		// generate invoice
		Invoice invoice = invoiceBusinessFacade.performInvoiceGeneration(cart);
		
		// Generate PDF Invoice
		
		// Perform Payment
		
		// Generate and Send Confirmation Email
	}
	
	@Override
	public void performTryoutRegistration(Accountability accountability) {
		
		// validation
		if ( !Accountability.ACCNT_TYP_REG_TRYOUT.
					equalsIgnoreCase(accountability.getType().getName()) ) {
			throw new InvalidParameterException("Invlid Accountability Type");
		}
		if( !Event.EVENT_TYPE_SOCCER_TRYOUT.equalsIgnoreCase(
				accountability.getEvent().getEventName()) ) {
			throw new InvalidParameterException("Invlid Event Type");
		}
		
		// create tryout registration
		Registration reg = new Registration(accountability.getEvent().getEventId(),
				accountability.getParent().getPartyId(),
				accountability.getChild().getPartyId(), 
				accountability.getAccount().getAccountId());
		accountability.setRegistration(reg);
		
		// Add Soccer Season Event Line Item to Shopping Cart
		// computer and update shopping cart balance
		ShoppingCart cart = new ShoppingCart();
		cart.addLineItem(accountability.getEvent());
		
		// Persist to database
		// Persist Accountability including registration
		// Persist Shopping Cart
		
		// Generate Email
		
		// Send email
	}
	
	public void processShoppingCart() {
		
		// get principal user name
		// retrieve shopping cart
		// process shopping cart
		// generate invoice
		
	}

}
