package com.Java.Arrays.leetcode;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		int nums[] = { 0, 0, 0, 1, 1, 2, 2, 2, 3, 3 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int unq = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i+1]) {
				System.out.println(nums[i+1]+" is the "+unq+" unique element at "+(i+1));
				nums[unq] = nums[i+1];  
				unq++;
			}
		}
		System.out.println("Total "+unq+" Unique Elements");
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
