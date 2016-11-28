package com.git01.build;

public class Demo {
	public static void main(String[] args) {
		Food build = new Food.Build().setA().setC().build();
		System.out.println(build);
		
		FoodA setB = new FoodA().setA().setB();
		System.out.println(setB);
		
		
	}
}
