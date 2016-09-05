package com.jag.string.topstringqstns;


//How to replace each given character to other
public class J10ReplaceChar {

	
	public static void main(String[] args) {
		
		
		String input1 = "Gooogle";
		String input2 = "Gooogle";

		String output1 = input1.replace("o","x");
		String output2 = input2.replaceAll("o","x");
		
		System.out.println(output1); //Gxxxgle
		System.out.println(output2);
		
	}
}
