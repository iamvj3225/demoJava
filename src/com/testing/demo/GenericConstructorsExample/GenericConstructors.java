package com.testing.demo.GenericConstructorsExample;

public class GenericConstructors {

	// when ever we call the constructors that time its check first is their any
	// method have it of that type
	// if found then they called that method if not found that time it's called
	// Generic constructors

	public <T> GenericConstructors(T value) {
		System.out.println(value);
	}

	public GenericConstructors(String value) {
		System.out.println(value);
	}

	// you can also pass two or more parameter

	public <T, S> GenericConstructors(T value, S value1) {
		System.out.println(value);
		System.out.println(value1);
	}

}
