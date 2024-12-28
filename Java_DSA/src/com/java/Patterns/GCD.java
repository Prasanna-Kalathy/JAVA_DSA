package com.java.Patterns;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int Num1 = input.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int Num2 = input.nextInt();
		System.out.printf("Entered values are: %d and %d", Num1, Num2);
		input.close();

		System.out.println("\nGCD of "+ Num1 +" and "+ Num2+" are");
		getGCD(Num1, Num2);
	}
	public static int getGCD(int Num1, int Num2) {
		while (Num2 > 0) {
			int temp = Num1 % Num2;
			Num1 = Num2;
			Num2 = temp;
		}
		System.out.print(Num1);
		return Num1;
	}
}
