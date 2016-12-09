package com.git03.strategy;

public class CashNormal extends Cash{
	
	@Override
	public int getResult(int price) {
		return price;
	}
	
}
