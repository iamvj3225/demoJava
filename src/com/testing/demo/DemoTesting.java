package com.testing.demo;

public class DemoTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		GenericMethod<Integer> demo = new GenericMethod<Integer>(10);
		Integer value = demo.getValue();
		System.out.println(value);

		GenericMethod<Double> demoD = new GenericMethod<Double>(10.00);
		System.out.println(demoD.getValue());
		// multiple type method

		GenericMethodWithMultipleType<Double, String> multi = new GenericMethodWithMultipleType<Double, String>(8.0,
				"multip ", 99, "testing");

		// try to implement payment gateway for use

		System.out.println(multi.toString());

	}

}
