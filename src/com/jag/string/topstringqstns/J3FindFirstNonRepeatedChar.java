package com.jag.string.topstringqstns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//3) How to program to print first non repeated character from String? 

public class J3FindFirstNonRepeatedChar {

	/*
	 * Using LinkedHashMap to find first non repeated character of String
	 * 
	 * Algorithm : 
	 * 		Step 1: get character array and loop through it to build a
	 * 				hash table with char and their count. 
	 * 		Step 2: loop through LinkedHashMap
	 * 				to find an entry with value 1, that's your first non-repeated character,
	 * 				 as LinkedHashMap maintains insertion order.
	 */
	
	
	public static char getFirstNonRepeatedChar1(String str) {
		
		
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());

		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}

		
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		
		System.out.println("Didn't find any non repeated Character");
		return ' ';
	}
	
	
	

	/*
	 * Finds first non repeated character in a String in just one pass. 
	 * It uses two storage to cut down one iteration, 
	 * 
	 * standard space vs time trade-off.
	 * 
	 * Since we store repeated and non-repeated character separately, 
	 * 		at the end of iteration, 
	 * 		first element from List is our first non-repeated character from String.
	 */
	public static char getFirstNonRepeatedChar2(String word) {
		
		
		Set<Character> repeatedChars = new HashSet<>();
		List<Character> nonRepeatedChars = new ArrayList<>();
		
		
		for (int i = 0; i < word.length(); i++) {
			
			char letter = word.charAt(i);
			
			//Is 'char' available in Repeated Chars (Set)
			if (repeatedChars.contains(letter)) {
				continue;
			}
			
			
			//Is 'char' available in Non-Repeated Chars (List)
			if (nonRepeatedChars.contains(letter)) {
				
				//Remove -from Non-Repeated Chars (List)
				nonRepeatedChars.remove((Character) letter);
				
				//Add it in Repeated Chars (Set)
				repeatedChars.add(letter);
			
			
			//Is 'char' NOT available in Non-Repeated Chars (List)	
			} else {
				
				//Add it in Non-Repeated Chars (Set)
				nonRepeatedChars.add(letter);
				
			}
			
			
		}
		
		
		return nonRepeatedChars.get(0);
	}
	
	
	

	/*
	 * Using HashMap to find first non-repeated character from String in Java.
	 * 
	 * Algorithm : 
	 * 		Step 1 : Scan String and store count of each character in HashMap
	 *  
	 * 		Step 2 : traverse String and get count for each character from Map. 
	 * 				 Since we are going through String from first to last character, when
	 * 				 count for any character is 1, we break, it's the first non repeated character. 
	 * 				 Here order is achieved by going through String again.
	 */
	public static char getFirstNonRepeatedChar3(String word) {
		
		
		HashMap<Character, Integer> scoreboard = new HashMap<>();
		
		
		// build table [char -> count]
		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (scoreboard.get(c) == 1) {
				return c;
			}
		}
		
		
		System.out.println("Didn't find any non repeated Character");
		return ' ';
	}

	
	
	
	public static void main(String[] args) {

		System.out.println();
		System.out.println(J3FindFirstNonRepeatedChar.getFirstNonRepeatedChar1("hello"));
		
		System.out.println(J3FindFirstNonRepeatedChar.getFirstNonRepeatedChar1("abcdefghija"));
		
		System.out.println(J3FindFirstNonRepeatedChar.getFirstNonRepeatedChar1("Java"));
		System.out.println(J3FindFirstNonRepeatedChar.getFirstNonRepeatedChar1("simplest"));

	}
	
	

}
