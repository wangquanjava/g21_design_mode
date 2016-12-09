package com.git03.strategy;

public class CashRebate extends Cash{
	private double rebate;
	public CashRebate(double rebate) {
		this.rebate = rebate;
	}
	
	@Override
	public int getResult(int price) {
		return new Double(price*this.rebate).intValue();
	}
	
}
