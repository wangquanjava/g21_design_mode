package com.git02.simple_factory;

/**
 * 这是操作类，内部有两个数字，但是对这两个数的处理有多重情形，所以这里选择使用简单工厂模式，来产生不同的计算方式
 * 优势:
 *    1.把创建对象的任务都交给factory，任务明确
 *    2.假如再增加其他的算法，只需要继承Operator，然后写出自己算法法则，然后再在OperatorFactory中增加一个case就可以
 *    3.这样只需要再编译新添加的算法和工厂类就可以，其他的算法不受影响
 */
public class Demo {
	public static void main(String[] args) {
		Operator operator = OperatorFactory.build("+");
		operator.setA(2);
		operator.setB(3);
		System.out.println(operator.getResult());
	}
}
