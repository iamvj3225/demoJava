package com.test.three;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestThree {
	public static void main(String[] args) {
		// reverse String
		System.out.println(reversString("123"));
		// swap
		swapNumber(10, 20);
		// inside string count word
		Map<String, Integer> count = getCount("why is why");
		// Set<Entry<String, Integer>> entrySet = count.entrySet();

		for (Map.Entry<String, Integer> entrySet : count.entrySet()) {
			System.out.println(entrySet.getKey() + " :" + entrySet.getValue());
		}

		// check is prime or not
		System.out.println("is Prime " + IsPrime(14));

		// chekc is String is palindorme or not
		System.out.println("mom  is PalinDrome  " + isPalinDrome("mom1"));

		// check fibonaic
		System.out.println(fibonanic(7));

		// findduplicatinString
		findDuplicateInString("Raja");
	}

	private static void findDuplicateInString(String givenString) {

		Map<Character, Integer> charcount = new HashMap<>();

		for (char c : givenString.toCharArray()) {
			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> ent : charcount.entrySet()) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}

	}

	private static boolean isPalinDrome(String givemString) {
		// initialized variable strat and end
		int left = 0, right = givemString.length() - 1;
		while (left < right) {
			if (givemString.charAt(left) != givemString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	private static int fibonanic(int num) {
		if (num <= 1)
			return num;
		return fibonanic(num - 1) + fibonanic(num - 2);
	}

	private static boolean IsPrime(int num) {

		if (num <= 1)
			return false;
		if (num <= 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	private static Map<String, Integer> getCount(String givenString) {
		Map<String, Integer> wordCount = new HashMap<>();
		String[] words = givenString.split("\\s+");
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		return wordCount;
	}

	private static void swapNumber(int i, int j) {
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("i : " + i);
		System.out.println("J : " + j);
	}

	private static String reversString(String givenString) {
		// convert string to char array
		char[] charArray = givenString.toCharArray();
		// initialized variable for start point abd end point
		int left = 0, right = givenString.length() - 1;

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
