package com.jag.string;

public class String3Reverse {
	

	public static void main(String[] args) {
		
		// ******* How to Reverse a String in Java? ******

		String stringInput = "hello";

		// 1. Library Method (Best Way)
		//String reverseOutput1 = new StringBuffer(stringInput).reverse().toString();
		String reverseOutput1 = new StringBuilder(stringInput).reverse().toString();
		System.out.println(reverseOutput1);

		
		// 2. Iterative (Worst Way) (More strings / memory)
		// Loop (original.length() - 1) to 0
		String reverseOutput2 = "";
		for (int i = stringInput.length() - 1; i >= 0; i--) {
			reverseOutput2 = reverseOutput2 + stringInput.charAt(i);
			// "" + o
			// "o" + l
			// "ol" + l
			// "oll" + e
			// "olle" + h
			// "olleh"
		}
		System.out.println(reverseOutput2);

		
		// 3. Recursion (Good Way)
		String reverseOutput3 = reverseString(stringInput);
		System.out.println(reverseOutput3);
		
		
		
		//----------------------------------------------
		// ******* palindrome ******
		System.out.println(isPalindrome2("amma"));
		System.out.println(isPalindrome2("hello"));
		
		
		
		
	}
	

	
	/*
	 
	 


String reverse(String inputTxt){
	
	if(inputTxt.length() == 1){
		return inputTxt;
	}
	
	return reverse(inputTxt.subString(1)) + inputTxt.charAt(0);
	
}





(hello)
	(ello) + h
		(llo) + e
			(lo) + l
				(o) + l
					return 'o'; 
					
				return 'o+l';
				
			return 'ol+l';	
			
		return 'oll+e';		
	
	return 'olle+h';

elloh


	
	 
	 
	 */
	
	public static String reverseString(String inputTxt) {
		
		if (inputTxt.length() == 1) {
			System.out.println("Last Char :"+inputTxt);
			return inputTxt;
		}

		String outputTxt = reverseString(inputTxt.substring(1)) + inputTxt.charAt(0);

		System.out.println("rev(" + inputTxt.substring(1) + ") + '" + inputTxt.charAt(0) + "' ==> " + outputTxt);
		return outputTxt;
		
		
		// Last Char :o
		
		// rev(o) + 'l' ==> ol 
		// rev(lo) + 'l' ==> oll 
		// rev(llo) + 'e' ==> olle
		// rev(ello) + 'h' ==> olleh
		 
		
	}
	
	
	public static boolean isPalindrome(String originalString) {
		
		//'dad' --> 'dad'
		//'amma' --> 'amma'
		//'appa' --> 'appa'
		
		// 1. Reverse the String
		String reversedString = new StringBuilder(originalString).reverse().toString();
		
		// 2. compare 'string' with 'reversedString'
		if(originalString.equals(reversedString)){
			return true;
		}
		
		return false;
	}
	
	

	public static boolean isPalindrome2(String stringInput) {
		
		String reverseOutput2 = "";
		for (int i = stringInput.length() - 1; i >= 0; i--) {
			reverseOutput2 = reverseOutput2 + stringInput.charAt(i);
			// "" + o
			// "o" + l
			// "ol" + l
			// "oll" + e
			// "olle" + h
			// "olleh"
			
			String splitedString = stringInput.substring(0, (reverseOutput2.length()-1));
			System.out.println(splitedString+"--"+reverseOutput2);
			if(!splitedString.equalsIgnoreCase(reverseOutput2)){
				return false;
			}
			
		}
		System.out.println(reverseOutput2);

		if(stringInput.equalsIgnoreCase(reverseOutput2)){
			return true;
		}else{
			return false;
		}
		
	}
	
	
}
