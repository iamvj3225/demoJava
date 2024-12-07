package com.Bounded.Type.Parameters.demo;

class A {

}

interface B {

}

interface C {

}

class D extends A implements B, C {

}

public class BoundedTypeParameters {

	public static <T extends Number> void getSum(T value1, T value2) {
		System.out.println(value1.getClass().getName());
		if (value1.getClass().getName().contains("Integer")) {
			int sum = value1.intValue() + value2.intValue();
			System.out.println(sum);

		} else {
			System.out.println("type is not integer");
		}
	}

	public static <T extends A & B & C > void multiple() {

	}

	public static void main(String[] args) {
		BoundedTypeParameters.getSum(12, 12);
		BoundedTypeParameters.multiple();
	}

}
