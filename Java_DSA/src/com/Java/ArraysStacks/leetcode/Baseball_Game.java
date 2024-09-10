package com.Java.ArraysStacks.leetcode;

public class Baseball_Game {

	public static void main(String[] args) {
		String operations[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		for(String s: operations){
			System.out.print(s + " ");
		}
		System.out.println();

		int ans[] = new int[operations.length];
		int index = 0; //Implementing the index feature of Arraylist for the Array
		
		for(String str: operations){
			switch (str) {
			case "C":
				index--;
				System.out.println("Removed " + str);
				break;
			case "D":
				ans[index] = ans[index-1]*2;
				index++;
				System.out.println("Added " + ans[index]);
				break;
			case "+":
				ans[index] = ans[index-1] + ans[index-2];
				System.out.println("Added " + ans[index]);
				index++;
				break;
			default:
				ans[index] = Integer.parseInt(str);
				index++;
				break;
			}
		}
		int sum = 0;
		for (int point : ans) {
			sum += point;
		}
		System.out.println(sum);
		for(int i: ans)
		System.out.print(i+ " ");
	}
}
