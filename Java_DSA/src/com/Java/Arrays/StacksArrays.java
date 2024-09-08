package com.Java.Arrays;

import java.util.ArrayList;

public class StacksArrays {

	ArrayList<Integer> stack = new ArrayList<Integer>();

	//Dummy Constructor
	//public StacksArrays() {
	//}

	public void push(int n) {
		stack.add(n);
	}

	public int pop() {
		return stack.remove(stack.size() - 1);
	}

	public int size() {
		return stack.size();
	}
	
	//Main Method
	public static void main(String[] args) {
		StacksArrays stack = new StacksArrays();
		
		// Pushing elements into the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		// Displaying the size
		System.out.println("Stack size: " + stack.size());
		
		// Popping elements from the stack
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		
		// Displaying the size again
		System.out.println("Stack size: " + stack.size());
	}
}
