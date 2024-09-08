package com.Java.Arrays.leetcode;

import javax.print.attribute.standard.MediaSize.NA;

public class ShuffletheArray {

	public static void main(String[] args) {
		int nums[] = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
		
		int NArr[] = new int [2*n];

		
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i] + " Found at " + i + " should be at " + (i*2));
			NArr[i*2] = nums[i];
			System.out.println(nums[i+n] + " Found at " + (i+n) + " should be at " + (i*2+1));
			NArr[2*i+1] = nums[i+n];
		}
		System.out.println();
		
		for (int i = 0; i < NArr.length; i++) {
			System.out.print(NArr[i] + " ");
		}
		System.out.println();
		System.out.println("2 3 5 4 1 7");

	}

}
