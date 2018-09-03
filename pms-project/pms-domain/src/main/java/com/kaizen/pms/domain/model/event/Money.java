package com.kaizen.pms.domain.model.event;

public class Money {
	
	public final static String MONEY_TYPE_USD = "USD";  // "US Dollars"
	public final static String MONEY_TYPE_BP  = "BP";   // "British Pound"
	public final static String MONEY_TYPE_CAD = "CAD";  // "Canadian Dollars"
	
	private double cost;
	private MoneyType moneyType = new MoneyType("USD", "US Dollars");
	
	public Money() {
		
	}
	
	public Money(double cost) {
		this.cost = cost;
	}
	
	public Money(double cost, MoneyType type) {
		this.cost = cost;
		this.moneyType = type;
	}

	public double getCost() {
		return cost;
	}

	public MoneyType getMoneyType() {
		return moneyType;
	}
	
	
	public Money add(Money obj) {
		if (this == obj)
			return this;
		if (obj == null)
			return this;
		
		Money other = (Money) obj;
		this.cost +=other.cost;
		
		return this;
	}
}
