package com.javaone.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestOne {
	public static void main(String[] args) {

		// revers String
		System.out.println("Revers String " + reversString("Ram"));
		// swap number
		System.out.println("Swap number ");
		swapNumnber(16, 17);
		// inside word count in String
		Map<String, Integer> wordCountInString = getWordCountInString("i am boy and i am girl");
		for (Map.Entry<String, Integer> entrySet : wordCountInString.entrySet()) {
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
		}
		// iterate hash map using while loop
		mapIterate();
		// check is prime or not
		System.out.println("13 is this primeNumber" + IsPrimeNumber(13));
		// check string is palindrome or not
		System.out.println("mom is This String palindrome : " + Ispalindrome("mom"));
		// fiboinacci
		System.out.println("7 fibonaic is : "+givenFibonacci(7));
		// iterate array list using all three loop

	}

	private static int givenFibonacci(int num) {
		// check for one
		if (num <= 1)
			return num;
		return givenFibonacci(num-1) + givenFibonacci(num-2);
	}

	private static boolean Ispalindrome(String givenString) {
		// initialized variable for start and end point
		int left = 0, right = givenString.length() - 1;
		while (left < right) {
			if (givenString.charAt(left) != givenString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean IsPrimeNumber(int num) {
		// check for 1
		if (num <= 1)
			return false;
		// check for 3
		if (num <= 3)
			return true;
		// check for divied by 2 and 3
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

	private static void mapIterate() {
		// data created for iteration
		Map<String, Integer> data = new HashMap<>();

		//
		Iterator<Entry<String, Integer>> iterator = data.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();

		}
	}

	private static Map<String, Integer> getWordCountInString(String givenString) {
		Map<String, Integer> dmap = new HashMap<>();
		// convert into string array
		String[] words = givenString.split("\\s+");
		// iterate that string array
		for (String word : words) {
			dmap.put(word, dmap.getOrDefault(word, 0) + 1);
		}
		return dmap;
	}

	private static void swapNumnber(int i, int j) {
		System.out.println("swap number before value ");
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("swap number after value ");
		System.out.println("i : " + i);
		System.out.println("j : " + j);

	}

	private static String reversString(String givenString) {
		// step : convert given String to char array
		char[] cha = givenString.toCharArray();
		// step : initialized variable
		int left = 0, right = givenString.length() - 1;
		// step : use while loop
		while (left < right) {
			char temp = cha[left];
			cha[left] = cha[right];
			cha[right] = temp;
			left++;
			right--;
		}
		// step :return string
		return new String(cha);
	}
}
