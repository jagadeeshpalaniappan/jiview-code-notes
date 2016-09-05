package com.jag.string.topstringqstns;

import java.util.Arrays;


//How to check if two Strings are anagrams of each other? 


public class J2AnagramCheck {
	
	/**
	 * Two strings are anagrams 
	 * --if they are written using the same exact letters, ignoring space, punctuation and capitalization.
	 *  'Stop' and 'Tops' -- 'Army' & 'Mary' are anagram of each other.
	 */
	
	/**
	 * One way to find if two Strings are anagram in Java. 
	 * This method assumes both arguments are not null and in lowercase.
	 * 
	 * 
	 * @return true,if both String are anagram
	 */

	public static boolean isAnagram1(String word1, String word2) {
		
		//If both are not same length "It is NOT anagram"
		if (word1.length() != word2.length()) {
			return false;
		}
		
		
		char[] chars = word1.toCharArray();
		for (char c : chars) {
			
			int index = word2.indexOf(c);
			
			System.out.println("each char :"+c);
			
			//If 'index' found
			if (index != -1) {
								
				//removing the found 'char' 
				//Since, String is immutable, We took all characters --apart from that 'found char'
				word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
			} 
			
			//If 'index' NOT found
			else {
				return false;
			}
		}
		
		
		//After all of the removal of characters, 
		//	--If you still have some words left over --It is NOT -Anagram
		//	--If nothing left over, --It is Anagram
		return word2.isEmpty();
	}

	/**
	 * 
	 * Another way to check if two Strings are anagram or not in Java
	 * This method assumes that both word and anagram are not null and lowercase
	 * 
	 * @return true,if both Strings are anagram.
	 */

	public static boolean isAnagram2(String word, String anagram) {
		
		
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		
		
		return Arrays.equals(charFromWord, charFromAnagram);
	}

	
	
	public static boolean isAnagram3(String first, String second) {
		
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		
		
		for (char ch : characters) {
			
			int index = sbSecond.indexOf("" + ch);
			
			//If 'index' found
			if (index != -1) {
				
				//removing the found 'char' 
				sbSecond.deleteCharAt(index);
			} 
			
			//If 'index' NOT found
			else {
				return false;
			}
		}
		
		
		//isEmpty?
		return sbSecond.length() == 0 ? true : false;
	}

	
	
	public static void main(String[] args) {


		System.out.println(J2AnagramCheck.isAnagram3("army", "mary")); 	//true
		
		System.out.println("-------------");

		System.out.println(J2AnagramCheck.isAnagram3("stop", "tops")); 	//true
		
		System.out.println("-------------");
		
		System.out.println(J2AnagramCheck.isAnagram3("fill", "fild"));	//false
		
		
		

	}

}
