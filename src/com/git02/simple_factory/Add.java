package com.git02.simple_factory;

public class Add extends Operator{

	@Override
	public double getResult() {
		return this.getA()+this.getB();
	}

}
