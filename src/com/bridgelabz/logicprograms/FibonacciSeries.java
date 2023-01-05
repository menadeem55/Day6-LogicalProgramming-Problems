package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Take input from the user
		// Create instance of the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");

		int size = scanner.nextInt(); // declare and initialize the number
		int num1 = 0, num2 = 1;
		int num3;

		// print the number 0 and 1 here in the scanner

		System.out.println("Fabonacci Series of: " + size);
		System.out.println(num1 + " " + num2);
		for (int i = 2; i <= size; i++) {

			// here adding the number 0+1
			num3 = num1 + num2;
			System.out.println(" " + num3);

			// Now here the swapping values

			num1 = num2;

		}

	}

}
