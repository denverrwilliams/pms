package com.kaizen.pms.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceMock {
	
	private String invoiceNo;
	private String accountNo;
	private Date dueDate;
	
	private List<LineItem> lineItems = new ArrayList<>();

	public InvoiceMock(String invoiceNo, String accountNo, Date dueDate) {
		this.invoiceNo = invoiceNo;
		this.accountNo = accountNo;
		this.dueDate = dueDate;
	}
	public List<LineItem> addLineItem(LineItem lineItem) {
		lineItems.add(lineItem);
		return lineItems;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
}

class LineItem {
	
	String Code; 
	String description;
	int qty;
	Double Price;
	Double lineTotal;
	
	public LineItem(String code, String description, int qty, Double price, Double lineTotal) {
		Code = code;
		this.description = description;
		this.qty = qty;
		Price = price;
		this.lineTotal = lineTotal;
	}
	
	public String getCode() {
		return Code;
	}
	public String getDescription() {
		return description;
	}
	public int getQty() {
		return qty;
	}
	public Double getPrice() {
		return Price;
	}
	public Double getLineTotal() {
		return lineTotal;
	}
	
	
	
}
