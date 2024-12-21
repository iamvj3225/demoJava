package com.Bounded.Type.Parameters.dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dec21 {
	public static void main(String[] args) {

		// reverse
		System.out.println(getStringForReverse("123"));
		// swap
		swapnumber(20, 30);
		// get count of duplicate word in string
		Map<String, Integer> map = getCountOfDuplicateWordFromString("i am am two");

		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + " : " + en.getValue());
		}
		// get count of duplicate letter in string
		getCountOfDuplicateLetterFromString("Moon");
		// isPrimenumber
		System.out.println("13 is isPrimenumber : " + isPrimenumber(13));
		// palindrome
		System.out.println("moom is palindrome : " + isPalindrome("moon"));
		// febico
		System.out.println("get fibonaci number : " + getFibonaciNumber(7));
	}

	private static int getFibonaciNumber(int num) {
		if (num <= 1)
			return num;
		return getFibonaciNumber(num - 1) + getFibonaciNumber(num - 2);
	}

	private static boolean isPalindrome(String givenString) {
		// start and end point
		int left = 0, right = givenString.length() - 1;

		char[] ch = givenString.toCharArray();

		while (left < right) {
			if (givenString.charAt(left) != givenString.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	private static boolean isPrimenumber(int num) {
		// check for 1
		if (num <= 1)
			return false;
		// check for 3
		if (num <= 3)
			return true;
		// check for 2 and 3 divisible
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		// check for large number
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

	private static void getCountOfDuplicateLetterFromString(String givenString) {
		Map<Character, Integer> map = new HashMap<>();
		char[] letters = givenString.toCharArray();

		for (char c : letters) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + " : " + en.getValue());
		}
	}

	private static Map<String, Integer> getCountOfDuplicateWordFromString(String givenString) {
		Map<String, Integer> dmap = new HashMap<>();

		String[] words = givenString.split("\\s+");

		for (String word : words) {
			dmap.put(word, dmap.getOrDefault(word, 0) + 1);
		}
		return dmap;
	}

	private static void swapnumber(int i, int j) {
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}

	private static String getStringForReverse(String givenString) {
		// convert given strinng to char array
		char[] charArray = givenString.toCharArray();

		// initailized start and end point
		int left = 0, right = givenString.length() - 1;

		// use swap method
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	}
}
