package com.jag.datastructures.custom;

public class CustomStackTest {

	public static void main(String[] args) {
		
				
		MyStack theStack = new MyStack(10);
		theStack.push(10l);
		theStack.push(20l);
		theStack.push(30l);
		theStack.push(40l);
		theStack.push(50l);
		
		System.out.println(theStack);
		
		//Peek [last element] --will not take out from array
		System.out.println(theStack.peek());
		
		System.out.println(theStack);
		
		
		
		System.out.println("Min: "+theStack.minElement());
				
		
		//Popout All the elements
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
			System.out.println(theStack);
		}
		
		
		System.out.println("----");
		System.out.println(theStack);
	}
}

class MyStack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public MyStack(int s) {
		maxSize = s;
		stackArray = new long [maxSize];
		
		//Before First Element --Insertion
		top = -1;
	}

	public void push(long element) {
		stackArray[++top] = element;
	}

	public long pop() {
		int popOutIndex = top--;

		long result =  stackArray[popOutIndex];
	
		//remove the element --from stack
		stackArray[popOutIndex] = 0;
		
		return result;
	}
	
	

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	

	@Override
	public String toString() {
		String output = "Top: ["+top+"], Stack:: ";
		
		for(long e : stackArray){
			if(e!=0){
				output = output+" "+e;
			}	
		}
		
		return output;
	}
	
	


	public long minElement() {
		
		long minElement = stackArray[0];
		
		for(long e : stackArray){
			
			if(e != 0 && e < minElement){
				minElement = e;
			}	
		}
		
		return minElement;
	}
	
	
	
	
	
}