package com.Java.Patterns;

import java.util.Scanner;

public class Pattern_L1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = input.nextInt();

		Pattern2(Num);

		input.close();
	}

	// Continues_Pattern
	public static void Pattern3(int Num) {
		// Since the value increases continuously
		int val = 1;
		for (int i = 1; i <= Num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
	}
	//Right Triangle Pattern
	public static void Pattern2(int Num) {
		for (int i = 1; i <= Num; i++) {
			// for (int j = 0; j <= Num-i; j++) {
			// for (int j = Num-1; j >= Num-i; j--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Square_Pattern
	public static void Pattern1(int Num) {
		for (int i = 1; i <= Num; i++) {
			for (int j = 1; j <= Num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
