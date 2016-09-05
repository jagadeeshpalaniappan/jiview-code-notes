package com.jag.string.topstringqstns;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// 1) How to Print duplicate characters from String?


public class J1FindDuplicateCharacters {

	public static void main(String args[]) {
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("Java");
	}

	/* * Find all duplicate characters in a String and print each of them. */
	public static void printDuplicateCharacters(String word) {

		char[] characters = word.toCharArray();
		
		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character ch : characters) {
			
			//If map already contains that 'char' as key
			if (map.containsKey(ch)) {
				
				//Get current count -by key --> and increase the count
				map.put(ch, map.get(ch) + 1);
			
			//If not available, increase the key	
			} else {
				map.put(ch, 1);
			}
			
		}
		
		
		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		
		
		System.out.println("List of duplicate characters in String"+ word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() +" : "+ entry.getValue());
			}
		}
		
		
	}
	
	
}
