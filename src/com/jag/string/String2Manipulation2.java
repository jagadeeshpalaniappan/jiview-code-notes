package com.jag.string;

import java.util.StringTokenizer;

public class String2Manipulation2 {

	// ** every object has 'toString()'
	// ** Referenced data type
	// ** Immutable

	/*
	 * 
	 * .concat()
	 * .format()
	 * .substring()
	 * 
	 * .length()
	 * .charAt()
	 * .indexOf()
	 * .lastIndexOf()
	 * .toUpperCase()
	 * .toLowerCase()
	 * 
	 * .replace()
	 * 
	 * 
	 */


	public static void main(String[] args) {
		
		
		//Primitive to String
		String integerString = String.valueOf(1);
		String characterString = String.valueOf('a');
		String booleanString = String.valueOf(true);
		
		//String to Primitive
		int ii = Integer.valueOf(integerString);
		char c = characterString.charAt(0);
		boolean b = Boolean.valueOf(booleanString);
		
		
		//---------------------------------------------------
		
		String input = "Sean sells seashells at the seashore";
				
		
		//How many words in sentence?
		String[] words = input.split(" ");
		
		System.out.println(words.length);
		
		//Display all words in new line
		for(int i=0; i< words.length; i++){
			System.out.println(words[i]);
		}
		
		System.out.println("----reverse words----");
		//Display all words (reverse) in new line
		//Iterate (words.length-1) to 0
		//int i= (words.length-1); i >= 0; i--
		
		for(int i= (words.length-1); i >= 0; i--){
			System.out.println(words[i]);
		}
		
		
		//How many words starts with 'se'?
		System.out.println("----How many words starts with 'se'----");
		int count =0;
		for(String word : words){
			if(word.toLowerCase().startsWith("se")){
				count++;
			}
		}
		
		System.out.println("Count :"+ count);
		
		
		//---------------------------------------------------
		/*
		
		StringTokenizer:
		Total Words: 5
		StringTokenizer Output:one
		StringTokenizer Output:two
		StringTokenizer Output:three
		StringTokenizer Output:four
		StringTokenizer Output:five
		
		Split:
		Total Words: 7
		Split Output: one
		Split Output: two
		Split Output: 
		Split Output: three
		Split Output: four
		Split Output: 
		Split Output: five

		 */
		
		String delimiter = ",";
		String stringWordsInput = "one,two,,three,four,,five";
 
		System.out.println("StringTokenizer:");
		StringTokenizer st = new StringTokenizer(stringWordsInput, delimiter);
		System.out.println("Total Words: "+ st.countTokens());	//5
		while (st.hasMoreTokens()) {
			System.out.println("StringTokenizer Output:"+st.nextToken());				
		}
		
		
 
		System.out.println("Split:");
		String[] tokens = stringWordsInput.split(delimiter);  //this is more fast
		System.out.println("Total Words: "+ tokens.length);
		for (int j = 0; j < tokens.length; j++) {
			System.out.println("Split Output: "+ tokens[j]);
		}
		
	}

}