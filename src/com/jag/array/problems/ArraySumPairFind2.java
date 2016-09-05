package com.jag.array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

	Find Pair Of Integers in Array whose Sum is Given Number

*/


/*
 	 With Previous Soln:::
	 Previous solution is correct but it's time complexity is very hight, O(n^2), 
	 which means Interviewer will surely ask you to improve your answer
	 and come up with solution whose complexity is either O(1), O(n) or O(nLog(n)). 
	 
	 So let's dig deeper to improve this answer. 
	 In order to find two numbers in an array whose sum equals a given value, 
	 we probably don't need compare each number with other. 
	 
	 
	 What we can do here is to store all numbers in a hashtable and just check if it contains second value in a pair. 
	 For example, if given sum is 4 and one number in pair is 3, then other must be 1 or -7. 
	 Do you remember the first question we asked, 
	 if array only contains positive numbers then we don't need to check for negative values in Map. 
	 
	 How is this solution better than previous one? It would require less comparisons. 
	 Only N to iterate through array and insert values in a Set because add() and contains() both O(1) operation in hash table. 
	 So total complexity of solution would be O(N). 

*/



public class ArraySumPairFind2 {

	public static void main(String args[]) {
		
		int[] inputArray1 = { 2, 4, 3, 5, 7, 8, 9 };
//		int[] inputArray1 = getRandomArray(9);
		int sumVal1 = 11;
		
		
		System.out.println("Random Integer array : " + Arrays.toString(inputArray1));
		System.out.println("Sum : " + sumVal1);
		System.out.println("pair of numbers from an array whose sum equals " + sumVal1);
		printPairsUsingSet(inputArray1, sumVal1);
		
		
		int[] inputArray2 = getRandomArray(9);
		int sumVal2 = 11;
		

		System.out.println("Random Integer array : " + Arrays.toString(inputArray2));
		System.out.println("Sum : " + sumVal2);
		System.out.println("pair of numbers from an array whose sum equals " + sumVal2);
		printPairsUsingSet(inputArray2, sumVal2);
		
		
	}
	
	
	

	/**
	 * Given an array of integers finds two elements in the array whose sum is
	 * equal to n.
	 * 
	 * @param numbers
	 * @param sumVal
	 */
	public static void printPairsUsingSet(int[] numbers, int sumVal) {
		
		if (numbers.length < 2) {
			return;
		}
		
		Set<Integer> set = new HashSet<Integer>(numbers.length);
		
		
		for (int eachVal : numbers) {
			
			int targetVal = sumVal - eachVal;
			
			
			// if target number is not in set then add
			if (!set.contains(targetVal)) {
				
				set.add(eachVal);
			} else {
				
				//Found
				System.out.printf("(%d, %d) %n", eachVal, targetVal);
			}
		}
		
		
	}



	/**
	 * 
	 * Utility method to return random array of Integers in a range of 0 to 15
	 */
	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}
}
