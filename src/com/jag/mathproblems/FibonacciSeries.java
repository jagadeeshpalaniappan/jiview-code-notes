package com.jag.mathproblems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {


	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

	/*
	 * 
	 * 0+1 = 1 
	 * 1+1 = 2 
	 * 2+1 = 3 
	 * 3+2 = 5 
	 * 5+3 = 8 
	 * 8+5 = 13
	 * 
	 */

	private static void printFibonacciSeries(int maxNo) {

		List<Integer> fibocciSeries = new ArrayList<Integer>();

		int firstItem = 0;
		int secondItem = 1;

		fibocciSeries.add(firstItem);
		fibocciSeries.add(secondItem);

		int thirdItem = 0;

		while (thirdItem <= maxNo) {

			thirdItem = firstItem + secondItem;

			firstItem = secondItem;
			secondItem = thirdItem;

			fibocciSeries.add(thirdItem);

		}

		System.out.println(fibocciSeries);

	}

	private static boolean isFibonacciNo(int inputNumber) {

		int firstItem = 0;
		int secondItem = 1;

		int thirdItem = 0;

		while (thirdItem < inputNumber) {

			thirdItem = firstItem + secondItem;

			firstItem = secondItem;
			secondItem = thirdItem;

		}

		if (thirdItem == inputNumber) {

			System.out.println("Number belongs to Fibonacci series");
			return true;
		} else {

			System.out.println("Number doesn't belongs to Fibonacci series");
			return false;
		}

	}
	
	

	public static void main(String[] args) {

		int inputNumber = 55;

		printFibonacciSeries(inputNumber);

		if (isFibonacciNo(inputNumber)) {

			System.out.println(inputNumber + " : Number belongs to Fibonacci series");

		}
		

	}
	

}