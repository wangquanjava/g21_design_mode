package com.git01.build;

public class FoodA {
	private boolean a;
	private boolean b;
	private boolean c;
	
	public FoodA() {
		super();
	}
	
	public FoodA setA() {
		this.a = true;
		return this;
	}
	public FoodA setB() {
		this.b = true;
		return this;
	}
	public FoodA setC() {
		this.c = true;
		return this;
	}

	@Override
	public String toString() {
		return "FoodA [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
