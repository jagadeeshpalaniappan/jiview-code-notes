package com.jag.datastructures.custom;

public class CustomStackTestAnyType {

	public static void main(String[] args) {

		int a = -1, b = -1;
		System.out.println(++a);
		System.out.println(b++);

		MyStackAnyType<Long> theStack = new MyStackAnyType<Long>(10);
		theStack.push(10l);
		theStack.push(20l);
		theStack.push(30l);
		theStack.push(40l);
		theStack.push(50l);

		System.out.println(theStack);

		System.out.println(theStack.peek());

		// Popout All the elements
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
			System.out.println(theStack);
		}

		System.out.println("----");
		System.out.println(theStack);
	}
}

class MyStackAnyType<E> {

	private int maxSize;
	private Object[] stackArray;
	private int top;

	public MyStackAnyType(int s) {
		maxSize = s;
		stackArray = new Object[maxSize];

		// Before First Element --Insertion
		top = -1;
	}

	public void push(E element) {
		stackArray[++top] = element;
	}

	public E pop() {
		int popOutIndex = top--;

		E result = (E) stackArray[popOutIndex];

		// remove the element --from stack
		stackArray[popOutIndex] = 0;

		return result;
	}

	public E peek() {
		return (E) stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	@Override
	public String toString() {
		String output = "Top: [" + top + "], Stack:: ";

		for (Object e : stackArray) {
			if (e != null) {
				output = output + " " + (E) e;
			}
		}

		return output;
	}

}