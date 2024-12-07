package com.testing.demo.methodGeneric;

public class GenericMethod<S> {

	public <T> T getValue(T value) {
		return value;
	}

	// above method and this method both are same if parameter is same
	// that if parameter is same then this method call only not above(generic
	// method)method called
	public String getValue(String value) {
		return value;
	}

	public <T> T getValue(T value, S value2) {
		return value;
	}

	// if i mention Class as generic parameter with s then only s i can use every
	// where when i use T then its give me error because T use for generic method
	// and T only accessible inside that method
	public S getvalueS(S value) {
		return value;
	}

}
