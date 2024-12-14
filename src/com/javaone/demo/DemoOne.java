package com.javaone.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoOne {
	public static void main(String[] args) {

		// Question 1 : Reverse String
		String reversString = reversString("vijay");
		System.out.println(reversString);

		// Question 2 : swap method
		swap(10, 20);

		// Question 3 : inside string count
		Map<String, Integer> getcount = getCount("i am i ");
		for (Entry<String, Integer> entry : getcount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Question 4 : iterate HashMap using while loop and advance for loop

		// Question 5 : check is prime or not

		// Question 6: String or number is palindrome

		// Question 7 : Fibonacci

		// Question 8 : itreate arrayList using while lopp for loop and advance for loop

		// Question 9 : find duplicate char in string

		// Question 10 : find second highest number in list

		// Question 11 : armsstring

		// Question 12 : remove all whitespace from string without using remove method

		// Question 13 : return indices of the two numbers such that they add up to
		// target

		// Question 14 : accepts comma-separated strings, sorts the strings in ascending
		// order, and outputs the concatenated string of sorted strings.

		// Question 15 : A string s is good if all characters that appear in s have the
		// same number of occurrences (i.e., the same frequency).

		// Question 16 :Given an array nums and a value val, remove all instances of
		// that value in-place and return the new length of the array. Do not allocate
		// extra space for another array

		// Question 17 :You are given an integer array nums and an array of queries
		// queries where queries[i] = [val, index]. For each query, add val to
		// nums[index]. Then, return the sum of all even numbers in nums.

		// Question 18 : two strings s and p, find all the start indices of p's anagrams
		// in s.

		// Question 19 : Given a string s, find the length of the longest substring
		// without repeating characters.

		// Question 20 : Merge two sorted linked lists and return it as a new sorted
		// list.

		// Question 21 :You are given an n x n 2D matrix representing an image, rotate
		// the image by 90 degrees (clockwise).

		// Question 22 : Given a non-negative integer num, repeatedly add all its digits
		// until the result has only one digit.

		// Question 23 : Given an integer, write a function to determine if it is a
		// power of two.

		// Question 24 : Given an array nums, write a function to move all 0's to the
		// end of it while maintaining the relative order of the non-zero elements.

		// Question 25 :Given an array nums of n integers where nums[i] is in the range
		// [1, n], return an array of all the integers in the range [1, n] that do not
		// appear in nums.
	}

	private static Map<String, Integer> getCount(String givenString) {
		Map<String, Integer> dmap = new HashMap<>();

		// split string in string array
		String[] words = givenString.split("\\s+");

		for (String word : words) {
			dmap.put(word, dmap.getOrDefault(word, 0) + 1);
		}
		return dmap;
	}

	private static void swap(int i, int j) {
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("i " + i);
		System.out.println("j " + j);
	}

	private static String reversString(String givenString) {
		// convert givenString into char array
		char[] charArray = givenString.toCharArray();

		// Initialize variable
		int left = 0;
		int right = givenString.length() - 1;

		// swap method
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		// return over all array
		return new String(charArray);
	}
}
