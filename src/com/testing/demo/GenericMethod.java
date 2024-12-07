package com.testing.demo;

public class GenericMethod<T> {

	public T value;

	public GenericMethod(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
