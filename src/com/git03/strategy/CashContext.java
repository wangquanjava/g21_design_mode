package com.git03.strategy;

public class CashContext {
	private Cash cash;

	public CashContext(String strategy) {
		switch (strategy) {
		case "原价":
			cash = new CashNormal();
			break;
		case "打八折":
			cash = new CashRebate(0.8);
			break;
		default:
			break;
		}
	}
	public int getResult(int price){
		return cash.getResult(price);
	}
}
