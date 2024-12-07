package com.testing.demo.interfaceDemo.bothGenericClassAndInterfaceExample;

//generic implemented class with implementing generic interface type
public class GenericInterfaceExample<T> implements GenericInterfaceExampleInterface<T> {

	@Override
	public T getValue(T val) {
		// TODO Auto-generated method stub
		return val;
	}

	public static void main(String[] args) {

		GenericInterfaceExample<Integer> demoExample = new GenericInterfaceExample<>();
		System.out.println(demoExample.getValue(1010));

		GenericInterfaceExample<Double> demoExampleDouble = new GenericInterfaceExample<>();
		System.out.println(demoExampleDouble.getValue(1010.000));

	}

}
