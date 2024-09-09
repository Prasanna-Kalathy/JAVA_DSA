package com.Java.Arrays.leetcode;

public class ConcatenationofArray {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2, 1 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int ans[] = new int[2*nums.length];
		System.out.println(ans.length);
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i+nums.length] = nums[i]; 
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
		System.out.println("1 3 2 1 1 3 2 1");
	}

}
