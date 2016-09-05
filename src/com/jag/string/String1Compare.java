package com.jag.string;

public class String1Compare {

	// ** every object has 'toString()'
	// ** Referenced data type
	// ** Immutable



	public static void main(String[] args) {
		
		System.out.println("--------- .equals() ---------");
		
		
		//Literal --> String Pool (Heap -- perm space)
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		System.out.println(s1 == s2);					//true
		System.out.println(s1.equals(s2));				//true
		System.out.println(s1.equalsIgnoreCase(s2));	//true
		
		//String Object --> Heap Memory
		String s11 = new String("Hello World");
		String s22 = new String("Hello World");
		
		System.out.println(s11 == s22);					//false
		System.out.println(s11.equals(s22));			//true
		System.out.println(s11.equalsIgnoreCase(s22));	//true
		
		
		System.out.println("--------- .compareTo() ---------");
		
		String helloWorld = "Hello World";
		
		System.out.println(helloWorld.compareTo("Hello World")); 				//0
		System.out.println(helloWorld.compareTo("hello world")); 				//-32
		System.out.println(helloWorld.compareToIgnoreCase("hello world")); 		//0
		System.out.println(helloWorld.toLowerCase().compareTo("hello world")); 	//0
		
		
		System.out.println(helloWorld.compareTo(new String("Hello World"))); 	//0
		System.out.println(helloWorld.compareTo(helloWorld)); 					//0
		
		
		
		System.out.println("--------- .startsWith() ---------");
		System.out.println(helloWorld.startsWith("Hello")); 					//true
		System.out.println(helloWorld.toLowerCase().startsWith("hello")); 		//true
		
		
	}

}