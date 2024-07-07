package com.Java.Patterns;

import java.util.Scanner;

public class Pattern_L2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of Rows: ");
		// int Row = input.nextInt();

		Pattern1(10);
		Pattern2(10);

		input.close();
	}

	// Pyramid Upside down Pattern
	public static void Pattern2(int Row) {
		for (int line = 1; line <= Row; line++) {
			for (int Space = 1; Space <= (line - 1); Space++) {
				System.out.print(" ");
			}
			for (int Star = 1; Star <= ((Row - line) * 2 + 1); Star++) {
				System.out.print("*");
			}
			for (int Space = 1; Space <= (line - 1); Space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	// Pyramid Pattern
	public static void Pattern1(int Row) {
		for (int line = 1; line <= Row; line++) {
			for (int Space = 1; Space <= (Row - line); Space++) {
				System.out.print(" ");
			}
			for (int Star = 1; Star <= (line * 2 - 1); Star++) {
				System.out.print("*");
			}
			for (int Space = 1; Space <= (Row - line); Space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}