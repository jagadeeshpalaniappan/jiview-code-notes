package com.jag.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		Integer[] array1 = arrayList.toArray(new Integer[arrayList.size()]);
		System.out.println("array1 = " + array1.length);
		
		
		 
	    //Creating and populating LinkedList
	    LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	    linkedlist.add(1);
	    linkedlist.add(2);
	    linkedlist.add(3);
	    linkedlist.add(5);
	    linkedlist.add(6);

	    //Converting LinkedList to Array
	    Integer[] array2 = linkedlist.toArray(new Integer[linkedlist.size()]);

	    //Displaying Array content
	    System.out.println("array2 = " + array2.length);
	 }
	
}
