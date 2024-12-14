package com.demo.testing;

public class ReversString {

	// main mehtod
	public static void main(String[] args) {
		System.out.println(reverse("123"));

	}

	private static String reverse(String inputString) {

		// convert into char array using string method
		char[] charData = inputString.toCharArray();
		// initialized variable left and right
		int left = 0, right = inputString.length() - 1;
		// swap in while loop
		while (left < right) {
			char temp = charData[left];
			charData[left] = charData[right];
			charData[right] = temp;
			left++;
			right--;
		}
		
		// return reverse String ;
		return new String(charData);
	}

}
