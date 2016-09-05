package com.jag.array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

	Find Pair Of Integers in Array whose Sum is Given Number

*/



/*
 first solution which comes in my mind is our friend brute-force, naive but genuine. 
 You take one number from array and then loop through array and output pairs which is equal to given sum.

 */


public class ArraySumPairFind1 {

	public static void main(String args[]) {
		
		int[] inputArray1 = { 2, 4, 3, 5, 7, 8, 9 };
		int[] inputArrayWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		
		int givenSum = 6;

		System.out.println("Given sum : " + givenSum);
		System.out.println("Given array : " + Arrays.toString(inputArray1));
		
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		
		List<Integer[]> allPairs1 = printPairs(inputArray1, givenSum);
		
		prettryPrint(allPairs1);
		
		
		System.out.println("----------------------------------");

		System.out.println("Given sum : " + givenSum);
		System.out.println("Given array : " + Arrays.toString(inputArrayWithDuplicates));
		
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		
		List<Integer[]> allPairs2 = printPairs(inputArrayWithDuplicates, givenSum);
		prettryPrint(allPairs2);
		
	}

	
	
	private static void prettryPrint(List<Integer[]> allPairs1) {

		for(Integer[] pair : allPairs1){
			System.out.println(Arrays.toString(pair));
		}
		
	}



	/**
	 * 
	 * Prints all pair of integer values from given array whose sum is is
	 * equal to given number. 
	 * complexity of this solution is O(n^2)
	 */
	public static List<Integer[]> printPairs(int[] array, int sum) {
		
		List<Integer[]> allPairs = new ArrayList<Integer[]>();
		
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			
			
			for (int j = i + 1; j < array.length; j++) {
				
				int second = array[j];
				
				
				if ((first + second) == sum) {
					//System.out.printf("(%d, %d) %n", first, second);
					Integer[] foundPair = {first, second};
					allPairs.add(foundPair);
				}
			}
			
		}
		
		
		return allPairs;
	}


	
	
	
	
}
