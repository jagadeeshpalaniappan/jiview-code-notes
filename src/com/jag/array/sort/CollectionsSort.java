package com.jag.array.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp1{
	private Long empId;

	public Emp1(Long empId) {
		this.empId = empId;
	}

	public Long getEmpId() {
		return empId;
	}
	
}

class Emp2 implements Comparable<Emp2>{
	private Long empId;

	public Emp2(Long empId) {
		this.empId = empId;
	}

	public Long getEmpId() {
		return empId;
	}

	@Override
	public int compareTo(Emp2 o) {
		
		if(this.getEmpId().equals(o.getEmpId()))
			return 0;
		
		return this.getEmpId() > o.getEmpId()? 1 : -1;
	}
	
}


public class CollectionsSort {

	public static void main(String[] args) {
		
		//Way1
		List<Emp1> emps1 = new ArrayList<Emp1>();
		emps1.add(new Emp1(5l));
		emps1.add(new Emp1(1l));
		emps1.add(new Emp1(3l));
		
		Collections.sort(emps1, new Comparator<Emp1>() {

			@Override
			public int compare(Emp1 o1, Emp1 o2) {
				
				if(o1.getEmpId().equals(o2.getEmpId()))
					return 0;
				
				return o1.getEmpId() > o2.getEmpId()? 1 : -1;
			}
		});
		
		
		for(Emp1 emp1 :emps1){
			System.out.print(emp1.getEmpId()+"--");
		}
		
		System.out.println("");
		
		//Way2
		List<Emp2> emps2 = new ArrayList<Emp2>();
		emps2.add(new Emp2(5l));
		emps2.add(new Emp2(1l));
		emps2.add(new Emp2(3l));
		
		Collections.sort(emps2);
		
		
		for(Emp2 emp1 :emps2){
			System.out.print(emp1.getEmpId()+"--");
		}
		
		
		
		
		
	}

}
