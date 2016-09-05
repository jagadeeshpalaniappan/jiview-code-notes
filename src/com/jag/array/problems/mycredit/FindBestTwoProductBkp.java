package com.jag.array.problems.mycredit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindBestTwoProductBkp {

	public static void main(String[] args) {

//		 Integer[] productPrices = {165, 22, 90, 50, 88, 345, 31};
//		Integer[] productPrices = { 981, 422, 815, 650, 920, 125, 277, 336, 230, 863, 916, 585, 221, 847, 168, 23, 677,	61, 400, 136, 874, 363, 394404, 316, 785 };
		 
		 Integer[] productPrices = {165, 102, 9, 51, 345, 31,165, 102, 9, 55, 345, 31,165, 102, 9, 55, 345, 31,165, 102, 9, 55, 345, 31,165, 102, 9, 55, 345, 31,165, 102, 9, 55, 345, 31,165, 102, 9, 55, 345, 31};
		 
		 
		int myTotalCreditLimit = 150;

		Long begin =System.nanoTime();
		Integer[] foundProducts = findBestTwoItems(myTotalCreditLimit, productPrices);
		Long end =System.nanoTime();
		
		System.out.println("Executed in "+(end-begin)*Math.pow(10, -6)+" milliseconds");
		
		
		int fistProductIndex = foundProducts[0];
		int secondProductIndex = foundProducts[1];

		System.out.println(productPrices[fistProductIndex] + "------" + productPrices[secondProductIndex]);

	}

	private static Integer[] findBestTwoItems(int myTotalCreditLimit, Integer[] productPrices) {
		Integer[] foundProductIndexes = { 0, 0 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int credit = myTotalCreditLimit;

		// Find Min
		Integer[] sortedPrices = productPrices;
		Arrays.sort(sortedPrices);
		Integer findMin = sortedPrices[0];

		// Array -to- Map
		for (int i = 0; i < productPrices.length - 1; i++) {
			
			// Adding key:productPrice and val:Index
			int productPrice = productPrices[i];
			
			//map.put(productPrice, i);

			/*
  			if(productPrice <= myTotalCreditLimit){
  				map.put(productPrice, i);
  			}
  			*/
			
			int myBestPrice = findMin + productPrice;
			if(myBestPrice == myTotalCreditLimit){
				
			}
			//Filtering the unwanted Elements
			if (myTotalCreditLimit <= myTotalCreditLimit) {
				map.put(productPrice, i);
			}

		}
		

		Set<Integer> filteredProductPrizes = map.keySet();

		System.out.println(filteredProductPrizes);

		while (credit > 0) {

			System.out.println("Look for this Credit Prize: " + credit);

			for (Integer productPrice : filteredProductPrizes) {

				// int productPrice = productPrices[i];

				System.out.println(map);

				int tmpPrize = credit - productPrice;
				System.out.println(credit + "-" + productPrice + "= " + tmpPrize);

				// Check tmpPrize is available in Map
				if (map.containsKey(tmpPrize)) {

					// Product Found -with tmpPrize

					// Current Index
					foundProductIndexes[0] = map.get(productPrice);

					// Get 'tmpPrize' Product Index
					foundProductIndexes[1] = map.get(tmpPrize);

					return foundProductIndexes;
				}

			}

			// Look for next reduced -Credit Limit Price
			System.out.println("Go to next reduced -Credit Limit Price");
			credit--;
		}

		return foundProductIndexes;
	}

}
