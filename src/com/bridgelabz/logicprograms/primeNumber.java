package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class primeNumber {
	/*
	 * a number that can be divided exactly only by itself and 1, for example 7, 17 and 41
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");

		int number = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 0; i < number / 2; i++) { // check if the number is divisible by any number in given range
			if (number % 2 == 0) { // condition for no prime number
				isPrime = false; // Prime is set to false

			}

		}
		if (isPrime == true) // if condition set to true
			System.out.println(number + " is Prime");
		else
			System.out.println(number + " is Not Prime");

	}

}
