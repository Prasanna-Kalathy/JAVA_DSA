package com.Java.Patterns;

import java.util.Scanner;

public class Pattern_L3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("Enter the Number of Rows: ");
		// int Row = input.nextInt();
		Pattern4(5);
		input.close();
	}

	// Inverted Space Dimond Pattern
	public static void Pattern4(int Row) {
		for (int i = 1; i <= Row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int Space = 0; Space < (Row * 2) - (i * 2); Space++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = Row - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int Space = 0; Space < (Row * 2) - (i * 2); Space++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Space Dimond Pattern
	public static void Pattern3(int Row) {
		for (int i = Row; i >= 1; i--) {
			for (int Star = 1; Star <= i; Star++) {
				System.out.print("*");
			}
			for (int Space = 0; Space < (Row * 2) - i * 2; Space++) {
				System.out.print(" ");
			}
			for (int Star = i; Star >= 1; Star--) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 1; i <= Row; i++) {
			for (int Star = 1; Star <= i; Star++) {
				System.out.print("*");
			}
			for (int Space = 0; Space < (Row * 2) - i * 2; Space++) {
				System.out.print(" ");
			}
			for (int Star = i; Star >= 1; Star--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	// Slope Letter Pattern
	public static void Pattern2(int Row) {
		for (int i = Row; i >= 0; i--) {
			for (char j = (char) ('A' + i); j <= Row + 'A'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// Pyramid Pattern
	public static void Pattern1(int Row) {
		for (int i = 1; i <= Row; i++) {
			for (int Space = Row - i; Space >= 1; Space--) {
				System.out.print(" ");
			}
			for (char j = 'A'; j < (i - 1) + 'A'; j++) {
				System.out.print(j);
			}
			for (char k = (char) ((i - 1) + 'A'); k >= 'A'; k--) {
				System.out.print(k);
			}
			for (int Space = 1; Space <= Row - i; Space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}