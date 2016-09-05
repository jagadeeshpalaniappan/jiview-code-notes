package com.jag.string.topstringqstns;

public class J8CountChars {

	public static void main(String args[]) {

		String input = "Today is Monday"; // count number of "a" on this String.
		char findChar = 'a';
		
		
		// counting occurrence of character with loop
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == findChar) {
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);

		
		// using foreach loop

		// resetting character count
		charCount = 0;
		for (char ch : input.toCharArray()) {
			if (ch == findChar) {
				charCount++;
			}
		}
		
		
		System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
	}

}
