package com.jag.array.problems.mycredit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindBestTwoProductUpdated2 {

	public static void main(String[] args) {

		Integer[] productPrices = { 165, 22, 94, 88, 53, 345, 31 };
//		Integer[] productPrices = { 981, 422, 815, 650, 920, 125, 277, 336, 230, 863, 916, 585, 221, 847, 168, 23, 677,	61, 400, 136, 874, 363, 316, 785 };


		int myTotalCreditLimit = 150;

		Integer[] foundProducts = findBestTwoProducts(myTotalCreditLimit, productPrices);

		int fistProductIndex = foundProducts[0];
		int secondProductIndex = foundProducts[1];

		System.out.println("Best two products -for my creditLimit ::" + myTotalCreditLimit);
		System.out.println(productPrices[fistProductIndex] + " and " + productPrices[secondProductIndex]);

	}

	private static Integer[] findBestTwoProducts(int myTotalCreditLimit, Integer[] productPrices) {
		Integer[] foundProductIndexes = { 0, 0 };

		Map<Integer, Integer> filteredProductMap = new HashMap<Integer, Integer>();

		int credit = myTotalCreditLimit;

		// Find Min val
		Integer[] sortedPrices = productPrices;
		Arrays.sort(sortedPrices);
		Integer findMin = sortedPrices[0];
		

		// Array -to- Map (Filtering the unwanted Products)
		for (int i = 0; i < productPrices.length; i++) {

			// Adding key:productPrice and val:Index
			int productPrice = productPrices[i];

			// map.put(productPrice, i);

			/*
			 * if(productPrice <= myTotalCreditLimit){ map.put(productPrice, i);
			 * }
			 */

			int myBestPrice = findMin + productPrice;

			// Filtering the unwanted Products
			if (myBestPrice <= myTotalCreditLimit) {
				filteredProductMap.put(productPrice, i);

				if (myBestPrice == myTotalCreditLimit) {
					// Found Product
					foundProductIndexes[0] = filteredProductMap.get(findMin);
					foundProductIndexes[1] = i;
					return foundProductIndexes;
				}
			}

		}

		Set<Integer> filteredProductPrizes = filteredProductMap.keySet();
		
		System.out.println(filteredProductPrizes);
		
		
		
		TreeMap<Integer, Map<Integer, Integer>> allTotals = new TreeMap<Integer, Map<Integer, Integer>>();
		
		Map<Integer, Integer> tmp = null;

		for (Integer firstProductPrice : sortedPrices) {

			for (Integer secondProductPrice : sortedPrices) {

				int totalPrice = firstProductPrice + secondProductPrice;
				
				if(totalPrice == myTotalCreditLimit){
					
					// Found Product
					foundProductIndexes[0] = filteredProductMap.get(firstProductPrice);
					foundProductIndexes[1] = filteredProductMap.get(secondProductPrice);
					return foundProductIndexes;
					
				}else if(totalPrice < myTotalCreditLimit){
					tmp = new HashMap<Integer, Integer>();
					tmp.put(0, firstProductPrice);
					tmp.put(1, secondProductPrice);
					
					allTotals.put(totalPrice, tmp);
				}
			}
		}
		
		System.out.println(allTotals);
		
		Integer bestTotalPrice = allTotals.lastKey();
		Map<Integer, Integer> bestTwoPrices=allTotals.get(bestTotalPrice);
		
		// Found Product
		foundProductIndexes[0] = filteredProductMap.get(bestTwoPrices.get(0));
		foundProductIndexes[1] = filteredProductMap.get(bestTwoPrices.get(1));

		return foundProductIndexes;
	}

}
