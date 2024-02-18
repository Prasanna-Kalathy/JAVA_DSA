package com.Java.Patterns;

public class Multiples_of_5 {

	public static void main(String[] args) {
		// First 6 multiples of 5 that is divisible by 3
		int i = 5;
		int count =0;
		while (count < 6) {
			if (i % 3 == 0){
				System.out.println(i);
				count++;
			}
			i+=5;
		}
	}
}
