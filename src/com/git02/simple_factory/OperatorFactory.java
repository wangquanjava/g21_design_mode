package com.git02.simple_factory;

public class OperatorFactory {
	
	
	public static Operator build(String str){
		switch (str) {
		case "+":
			return new Add();
		case "-":
			return new Subtraction();
		default:
			return new Add();
		}
	}
}
