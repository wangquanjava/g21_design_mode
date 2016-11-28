package com.git01.build;

/*
 * build模式
 * 1.就是把本来使用构造方式，传入参数来创建对象的，这里使用一个build类的链式编程采集这些参数，形成参数集合
 * 2.再把build给构造方法
 */
public class Food {
	private boolean a;
	private boolean b;
	private boolean c;
	
	public Food(Build build) {
		a = build.a;
		b = build.b;
		c = build.c;
	}

	
	@Override
	public String toString() {
		return "Food [a=" + a + ", b=" + b + ", c=" + c + "]";
	}


	public static class Build{
		private boolean a;
		private boolean b;
		private boolean c;
		
		public Build setA() {
			this.a = true;
			return this;
		}
		public Build setB() {
			this.b = true;
			return this;
		}
		public Build setC() {
			this.c = true;
			return this;
		}
		public Food build() {
			return new Food(this);
		}
	}
}
