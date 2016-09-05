package com.jag.array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

	Find Pair Of Integers in Array whose Sum is Given Number

*/



/*
 
 With Previous Soln:::
 By the this solution has few constraints, first it would need additional space of order O(n) to store numbers in Hashtable or Set, 
 so you need additional space which could be problem if array is very large


 A more efficient in-place solution would be to sort the array and use two pointers to scan through array from both direction i.e. beginning and end. 
 If sum of both the values are equal to given number then we output the pair and advance them. 
 If the sum of two numbers is less than k then we increase the left pointer, 
 else if the sum is greater than k we decrement the right pointer, 
 	until both pointers meet at some part of the array. 
 
 The complexity of this solution would be O(NlogN) due to sorting. 
 
 Remember to use a in-place sorting algorithm like quicksort to sort the array as we don't have additional space. 
 
 Thankfully, Arrays.sort() method uses a two pivot quicksort algorithm to sort array of primitives.
	


 * 
 */


public class ArraySumPairFind3 {

	public static void main(String args[]) {
		
		int[] inputArray1 = { 2, 4, 3, 5, 7, 8, 9 };
		int sumVal1 = 11;
		
		System.out.println("input int array : " + Arrays.toString(inputArray1));
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + sumVal1);
		printPairsUsingTwoPointers(inputArray1, sumVal1);
		
		
	}

	/**
	 * Given a number finds two numbers from an array so that the sum is equal
	 * to that number k.
	 * 
	 * @param numbers
	 * @param k
	 */
	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
	}

	/*  
	 * 
	 * Utility method to print two elements in an array that sum to k. 
	 * 
	 * */

	public static void prettyPrint(int[] random, int k) {
		
	}
}
