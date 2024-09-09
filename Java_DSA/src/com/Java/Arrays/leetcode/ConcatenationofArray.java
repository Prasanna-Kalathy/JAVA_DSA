package com.Java.Arrays.leetcode;

public class ConcatenationofArray {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2, 1 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int n = nums.length;
		int ans[] = new int[2*n];
		System.out.println(ans.length);
		System.arraycopy(nums,0,ans,0,n);
	    System.arraycopy(nums,0,ans,n,n);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
		System.out.println("1 3 2 1 1 3 2 1");
	}

}
