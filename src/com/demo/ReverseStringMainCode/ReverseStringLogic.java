package com.demo.ReverseStringMainCode;

public class ReverseStringLogic {

	// method that give reverse string

	public static String logicToReverseGivenString(String inputString) {

		// convert string to char array
		char[] stringToCharArray = inputString.toCharArray();

		// initialized variable
		int left = 0;
		int right = inputString.length() - 1;

		// swap the array
		while (left < right) {
			char temp = stringToCharArray[left];
			stringToCharArray[left] = stringToCharArray[right];
			stringToCharArray[right] = temp;
			left++;
			right--;
		}
		//
		return new String(stringToCharArray);
	}

}
