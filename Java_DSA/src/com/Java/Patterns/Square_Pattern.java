package com.Java.Patterns;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = input.nextInt();
		for (int i = 1; i <= Num; i++) {
//			for (int j = 0; j <= Num-i; j++) {
//			for (int j = Num-1; j >= Num-i; j--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
