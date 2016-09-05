package com.jag.array;

import java.util.Arrays;

public class FindMinMaxVal {


	public static void findMinMaxval(int[] numbers) {
		
		//Gold Coin Story
		//Assuming 'first' element as largest & smallest val 
		int largest = numbers[0];
		int smallest = numbers[0];
		
		
		for (int number : numbers) {
			
			if (number > largest) {
				//found 'bigger' coin replace it
				largest = number;
				
			} else if (number < smallest) {
				
				//found 'smaller' coin replace it
				smallest = number;
			}
		}
		
		
		System.out.println("Given integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
	}



	public static void main(String[] args) {

		int[] array1 =  { 1,2,3,4 };
		int[] array2 =  { Integer.MAX_VALUE, 12,13, 40, Integer.MIN_VALUE };
		
		findMinMaxval(array1);
		findMinMaxval(array2);


	}

}
