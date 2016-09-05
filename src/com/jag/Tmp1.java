package com.jag;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class A{
	static void method1(){
		System.out.println("MethodA --");
	}
}


class B extends A{
	static void method1(){
		System.out.println("MethodA --");
	}
}



public class Tmp1 {

	public static void main(String[] args) {
		
		A a = new A();
		A b = new B();
		
		a.method1();
		b.method1();
		
		
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
        hmap.put(2, "Anil");
        hmap.put(44, "Ajit");
        hmap.put(1, "Brad");
        hmap.put(4, "Sachin");
        hmap.put(88, "XYZ");

        //Map map= Collections.synchronizedMap(hmap);
        Set set = hmap.entrySet();
        synchronized(hmap){
            Iterator i = set.iterator();
            // Display elements
            while(i.hasNext()) {
               Map.Entry me = (Map.Entry)i.next();
               System.out.print(me.getKey() + ": ");
               System.out.println(me.getValue());
            }
        }
		
	}
}
