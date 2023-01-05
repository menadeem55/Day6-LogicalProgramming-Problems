package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt(); // read the number from the user
		System.out.println("Original Number: " + number); // print this original number
		int reverse = 0, remain; // variable initialization

		// Loop to find reverse number
		while (number != 0) { // variable initialization
			remain = number % 10;
			reverse = reverse * 10 + remain;
			number = number / 10; // reducing the digits in number

		}
		System.out.println("Reversed Number: " + reverse); // print the output of reverse number

	}

}
