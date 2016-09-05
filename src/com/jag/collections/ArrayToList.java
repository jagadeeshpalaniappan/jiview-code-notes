package com.jag.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		/* Array Declaration and initialization */
		String array1[] = { "Chennai", "Hyd", "Banglore", "Trichy" };

		/* Array to ArrayList conversion */
		ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(array1));

		System.out.println(arrayList1.size());

		// Array to Linked List
		//--------------
		
		
		
		
		// ArrayList to LinkedList
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("First");
		arrayList2.add("Second");
		arrayList2.add("Third");
		arrayList2.add("Random");

		List<String> linkedList2 = new LinkedList<String>();
		arrayList2.addAll(linkedList2);

		
		
		// LinkedList to ArrayList
		List<String> linkedList3 = new LinkedList<String>();
		// adding elements to the end
		linkedList3.add("First");
		linkedList3.add("Second");
		linkedList3.add("Third");
		linkedList3.add("Random");
		System.out.println("Actual LinkedList:" + linkedList3);
		List<String> arrarList3 = new ArrayList<String>();
		linkedList3.addAll(arrarList3);

	}
}
