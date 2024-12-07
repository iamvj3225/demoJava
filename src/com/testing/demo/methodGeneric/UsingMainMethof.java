package com.testing.demo.methodGeneric;

public class UsingMainMethof {
	public static void main(String[] args) {
		GenericMethod method = new GenericMethod();
		method.getValue(90);
		System.out.println("interger value : " + method.getValue(90));
		System.out.println("double value : " + method.getValue(90.00));
		System.out.println("String value : " + method.getValue("Any type is here "));
	}
}
