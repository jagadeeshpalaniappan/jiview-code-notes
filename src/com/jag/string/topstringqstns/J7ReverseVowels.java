package com.jag.string.topstringqstns;

import java.util.ArrayList;
import java.util.List;

public class J7ReverseVowels {

	public static String reverseVowels(String s, List<Character> vowelsList) {
		
		char[] arrayStr = s.toCharArray();

		int forwardItreationIndex = 0;
		int backwardIterationIndex = s.length() - 1;

		
		while (forwardItreationIndex < backwardIterationIndex) {
			
			//If 'arrayStr[forwardItreationIndex]' --NOT -available in vowels list
			if (!vowelsList.contains(arrayStr[forwardItreationIndex])) {
				
				//Increase the forwardItreationIndex --Go forward to next elemnt index
				forwardItreationIndex++;
				
				//Skip the further execution
				continue;
			}

			
			//If 'arrayStr[backwardIterationIndex]' --NOT -available in vowels list
			if (!vowelsList.contains(arrayStr[backwardIterationIndex])) {
				
				//Decrease the forwardItreationIndex --Go backward to next elemnt index
				backwardIterationIndex--;
				
				//Skip the further execution
				continue;
			}
			
			
			//------------------
			
			//If, it comes till here,  --forwardItreationIndex elmnt char & backwardIterationIndex elmnt char --both are VOWELS			
			
			//Swap --both the elements 
			
			char t = arrayStr[forwardItreationIndex];
			arrayStr[forwardItreationIndex] = arrayStr[backwardIterationIndex];
			arrayStr[backwardIterationIndex] = t;

			
			//Go to next element forward as well as backward
			forwardItreationIndex++;
			backwardIterationIndex--;
		}

		
		
		return new String(arrayStr);
	}
	
	
	

	public static void main(String[] args) {
		
		List<Character> vowelsList = new ArrayList<Character>();
		vowelsList.add('a');
		vowelsList.add('e');
		vowelsList.add('i');
		vowelsList.add('o');
		vowelsList.add('u');
		vowelsList.add('A');
		vowelsList.add('E');
		vowelsList.add('I');
		vowelsList.add('O');
		vowelsList.add('U');
		
		
		System.out.println(reverseVowels("google", vowelsList));  //geoglo
		
		

	}
}
