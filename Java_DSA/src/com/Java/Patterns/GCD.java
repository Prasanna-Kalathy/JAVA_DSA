package com.Java.Patterns;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int Num1 = input.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int Num2 = input.nextInt();
		System.out.printf("Entered values are: %d and %d", Num1, Num2);

		System.out.println("\nGCD of "+ Num1 +" and "+ Num2+" are");
		int GCD=Num2;
		while (GCD > 0) {
			GCD = Num1 % Num2;
			Num1 = Num2;
			Num2 = GCD;
		}
		System.out.print(Num1);
	}

}
