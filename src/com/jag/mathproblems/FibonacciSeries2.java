package com.jag.mathproblems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries2 {

	static List<Integer> fibonacciSeries = null;
	static int firstItem = 0, secondItem = 1, thirdItem = 0;

	static void printFibonacci(int count) {
		
		if (count > 0) {
			
			thirdItem = firstItem + secondItem;
			firstItem = secondItem;
			secondItem = thirdItem;
			
			//System.out.print(" " + thirdItem);
			fibonacciSeries.add(thirdItem);
			
			//Recursive
			printFibonacci(count - 1);
		}
		
	}

	public static void main(String args[]) {
		
		int noOfCounts = 10;
		
		
		fibonacciSeries = new ArrayList<>();
		fibonacciSeries.add(firstItem);//0
		fibonacciSeries.add(secondItem);//1
		
		printFibonacci(noOfCounts - 2);// n-2 because 2 numbers are already printed
		
		
		System.out.print(fibonacciSeries);		
		
	}

}