package com.jag.array.problems.mycredit;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindBestTwoProduct {

	public static void main(String[] args) {

//		 Integer[] productPrices = {165, 22, 95, 88, 55, 345, 31};
		 
		Integer[] productPrices = { 981, 422, 815, 650, 920, 125, 277, 336, 230, 863, 916, 585, 221, 847, 168, 23, 677,	61, 400, 136, 874, 363, 316, 785 };
		int myTotalCreditLimit = 150;

		Integer[] foundProducts = findBestTwoProducts(myTotalCreditLimit, productPrices);

		int fistProductIndex = foundProducts[0];
		int secondProductIndex = foundProducts[1];


		System.out.println("Best two products -for my creditLimit ::"+myTotalCreditLimit);
		System.out.println(productPrices[fistProductIndex] + " and " + productPrices[secondProductIndex]);

	}

	private static Integer[] findBestTwoProducts(int myTotalCreditLimit, Integer[] productPrices) {
		Integer[] foundProductIndexes = { 0, 0 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int credit = myTotalCreditLimit;

		// Find Min val	
		Integer findMin = Collections.min(Arrays.asList(productPrices));


		// Array -to- Map (Filtering the unwanted Products)
		for (int i = 0; i < productPrices.length; i++) {
			
			// Adding key:productPrice and val:Index
			int productPrice = productPrices[i];
			
			//map.put(productPrice, i);

			/*
  			if(productPrice <= myTotalCreditLimit){
  				map.put(productPrice, i);
  			}
  			*/
			
			int myBestPrice = findMin + productPrice;
			
			
			//Filtering the unwanted Products
			if (myBestPrice <= myTotalCreditLimit) {
				map.put(productPrice, i);
				
				
				if(myBestPrice == myTotalCreditLimit){
					//Found Product
					foundProductIndexes[0] = map.get(findMin);
					foundProductIndexes[1] = i;
					return foundProductIndexes;
				}
			}

		}
		

		Set<Integer> filteredProductPrizes = map.keySet();


		while (credit > 0) {


			for (Integer productPrice : filteredProductPrizes) {

				int tmpPrize = credit - productPrice;

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
			credit--;
		}

		return foundProductIndexes;
	}

}
