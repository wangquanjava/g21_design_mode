package com.git02.simple_factory;

public abstract class Operator {
	private double a;
	private double b;
	
	public abstract double getResult();
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
