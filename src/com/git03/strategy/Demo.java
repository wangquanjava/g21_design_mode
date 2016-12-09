package com.git03.strategy;

public class Demo {
	public static void main(String[] args) {
		int exec = new Demo().exec(100, "打八折");
		
		System.out.println(exec);
	}
	
	public int exec(int price,String strategy){
		CashContext cashContext = new CashContext(strategy);
		
		return cashContext.getResult(price);
	}
}
