package com.Java.ArraysStacks.leetcode;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		String operations[] = { "5","-2","4","C","D","9","+","+" };
		for (int i = 0; i < operations.length; i++) {
			System.out.print(operations[i] + " ");
		}
		System.out.println();
		
		Stack<Integer> ans = new Stack<>();
		for (int i = 0; i < operations.length; i++) {
			String str =operations[i];
			if(Character.isDigit(str.charAt(0))) {
				ans.add(Integer.parseInt(str));
				System.out.println("Added "+str);
			}
			else {
				switch (str) {
				case "C":
					System.out.println("Removed "+ans.getLast());
					ans.removeLast();
					break;
				case "D":
					ans.addLast(ans.getLast()*2);
					System.out.println("Added "+ans.getLast());
					
					break;
				case "+":
					System.out.println("Added "+ans.getLast()+" and "+(ans.get(ans.size()-2)));
					ans.add(ans.getLast()+(ans.get(ans.size()-2)));
					break;
				}
			}
		}
		System.out.println(ans);
		int sum = 0;
		while (ans.size() > 0) sum += ans.pop(); //Reffered from google
		System.out.println(sum);
	}
}
