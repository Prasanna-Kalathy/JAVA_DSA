package com.java.arrays.leetcode;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int nums[] = { 3, 1, 3, 2, 3, 0, 4, 2 };
		int val = 3;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				System.out.println(nums[i]+" is the "+k+" unique element at "+(i));
				nums[k] = nums[i];
				k++;
			}
		}
		System.out.println("Number of elements not equal to " + val + " is " + k +" out of "+nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
