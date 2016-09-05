package com.jag.array;

import java.util.TreeMap;

class RomanNumber {

	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	static {

		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");

	}

	public final static String toRoman(int number) {
		
		//get the 'key' val --which is closer to 'input number'
		int l = map.floorKey(number);

		//if return 'key' and 'input number' same
		// recursive -break  (found exact key-val)
		if (number == l) {
			return map.get(number);
		}

		
		// recursive
		return map.get(l) + toRoman(number - l);
	}

}

public class RomanNumberConversion {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "----------" + RomanNumber.toRoman(i));
		}
		
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
	      
	   // populating tree map
	   treemap.put(2, "two");
	   treemap.put(1, "one");
	   treemap.put(3, "three");
	   treemap.put(6, "six");
	   treemap.put(5, "five");
	      
	   System.out.println("Checking greatest key less than or equal to 4");
	   System.out.println("Value is: "+ treemap.floorKey(3));
		

	}
	
	
	
	
	

	
	
	
}
