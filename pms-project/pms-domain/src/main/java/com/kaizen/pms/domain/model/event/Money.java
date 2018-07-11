package com.kaizen.pms.domain.model.event;

import com.kaizen.pms.domain.enums.MoneyType;

public class Money {
	
	private double cost;
	private MoneyType moneyType = MoneyType.MONEY_USD;
	
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

	
}
