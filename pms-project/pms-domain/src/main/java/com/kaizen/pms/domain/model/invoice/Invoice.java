package com.kaizen.pms.domain.model.invoice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kaizen.pms.domain.Address;
import com.kaizen.pms.domain.EmailAddress;
import com.kaizen.pms.domain.Name;
import com.kaizen.pms.domain.PhoneNumber;
import com.kaizen.pms.domain.model.event.Event;
import com.kaizen.pms.domain.model.event.Money;

public class Invoice {
	
	private long invoiceId;
	
	private String logo;
	private String title;
	private Name orgname;
	private Address orgaddress;
	private PhoneNumber orgphone;
	private EmailAddress orgemail;
	
	private String statementNumber;
	private Date statementDate;
	private Money totalDue;
	
	private Name parentName;
	private Address parentAddress;
	private EmailAddress parentEmail;
	
	List<Event> lineitems = new ArrayList<Event>();

}
