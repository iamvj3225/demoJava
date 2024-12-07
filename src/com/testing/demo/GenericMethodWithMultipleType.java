package com.testing.demo;

public class GenericMethodWithMultipleType<T, V> {

	private T type1;

	private V type2;

	private int type3;

	private String type4;

	public GenericMethodWithMultipleType(T type1, V type2, int type3, String type4) {
		super();
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		this.type4 = type4;
	}

	@Override
	public String toString() {
		return "GenericMethodWithMultipleType [type1=" + type1 + ", type2=" + type2 + ", type3=" + type3 + ", type4="
				+ type4 + "]";
	}

}
