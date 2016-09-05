package com.jag.string;

public class String2Manipulation1 {

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

		// Concatenate
		System.out.println("--------- .concat() ---------");
		String h = "Hello ";
		String w = "World";
		System.out.println(h.concat(w)); //Hello World
		System.out.println(h + w + "s"); //Hello Worlds

		// Formating
		System.out.println("--------- .format() ---------");
		// %d --> integer
		// %s --> String
		// %f --> floats
		System.out.println(String.format("Jagadeesh has %d iPhones", 5));

		
		// Substrings
		System.out.println("--------- .substring() ---------");
		String hiJag = "Hi, Jagadeesh is Awesome";
		System.out.println(hiJag.substring(4)); 	//Jagadeesh is Awesome
		System.out.println(hiJag.substring(4, 13));	//Jagadeesh

		
		
		// Length
		System.out.println("--------- .length() ---------");
		String hiThere = "Hi there";
		System.out.println(hiThere.length());	//8

		// charAt
		System.out.println("--------- .charAt() ---------");
		System.out.println(hiThere.charAt(3));	//t

		// indexOf
		System.out.println("--------- .indexOf() ---------");

		//First Index
		System.out.println(hiThere.indexOf('e'));		//5
		//Start find from '6'
		System.out.println(hiThere.indexOf('e', 6));	//7
		//Last Index
		System.out.println(hiThere.lastIndexOf('e'));	//7
	
		
		// toUpperCase()
		System.out.println("--------- .toUpperCase() ---------");
		System.out.println(hiThere.toUpperCase());	//HI THERE

		// toLowerCase()
		System.out.println("--------- .toLowerCase() ---------");
		System.out.println(hiThere.toLowerCase());	//hi there

		
		// replace
		System.out.println("--------- .replace() ---------");
		String hiThereReplaced = hiThere.replace('e', 'z');
		System.out.println(hiThere +"-->"+ hiThereReplaced); //Hi there --> Hi thzrz

		

		String jagadeesh = "     Jagadeesh is     Awesome   ";
		System.out.println(jagadeesh); 							//     Jagadeesh is     Awesome
		//Outer trim
		System.out.println(jagadeesh.trim()); 					//Jagadeesh is     Awesome
		//Inner trim
		System.out.println(jagadeesh.replaceAll("\\s+", " "));	// Jagadeesh is Awesome 
		
		

	}

}