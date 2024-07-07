package com.Java.Patterns;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = input.nextInt();

//		Since the value increases continuously
		int val = 1;
		for (int i = 1; i <= Num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
	}
}
