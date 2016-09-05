package com.jag.string.topstringqstns;

import java.util.regex.Pattern;


//5) How to check if a String contains only digits?  

public class J5StringContainsOnlyNumbers {

	
	
	public static void main(String args[]) {
		
		String input1 = "123";
		String input2 = "abcd123";
		String input3 = "-123";
		String input4 = "123.12";
		
		
      
        // Regular expression in Java to check if String is number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        System.out.println( input1 + " is number : " + !pattern.matcher(input1).matches());
        System.out.println( input2 + " is number : " + !pattern.matcher(input2).matches());
        System.out.println( input3 + " is number : " + !pattern.matcher(input3).matches());
        System.out.println( input4 + " is number : " + !pattern.matcher(input4).matches());
        
        
        
    }

}

