package com.testing.demo.interfaceDemo;

//normal class with implementing generic interface type
public class ImplClass implements GenericInterface<Integer> {

	@Override
	public Integer getValueOfObject(Integer value) {
		// TODO Auto-generated method stub
		return value;
	}

	public static void main(String[] args) {
		ImplClass obj = new ImplClass();
		;
		System.out.println(obj.getValueOfObject(33));
	}

}
