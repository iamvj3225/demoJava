package com.demo.testing;

public class TeDemo {
	// main method
	public static void main(String[] args) {
		System.out.println(reverString("one"));
	}

	private static String reverString(String data) {
		// step 1 convert to char array
		char[] charArray = data.toCharArray();

		// initialized left as Zero and right as String size -1
		int left = 0;
		int right = charArray.length - 1;

		// use while loop for this
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		// return reverse string
		return new String(charArray);
	}

	private static String reverseString(String input) {

		// convert into char array
		char[] cha = input.toCharArray();

		// initialized left and right variable
		int left = 0;
		int right = input.length() - 1;

		// use while loop for swap
		while (left < right) {
			// assing
			char temp = cha[left];
			cha[left] = cha[right];
			cha[right] = temp;
			left++;
			right--;
		}
		// return reverse String
		return new String(cha);
	}

}
