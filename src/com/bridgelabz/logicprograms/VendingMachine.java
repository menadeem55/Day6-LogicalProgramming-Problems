package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//user input 
		System.out.println("Enter Amount: ");
		int amount = sc.nextInt();			//store the amount n variable
		int currency[] = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };		//Available currency in array 
		int index = 0;			// declare index to store amount
		while (amount != 0) {	// to check until when amount will be zero
			int noteCounter = 0;
			System.out.println("Amount Left: " + amount);
			while (amount >= currency[index]) {		
				amount = amount - currency[index];
				noteCounter++;

			}
			System.out.println(currency[index] + " * " + noteCounter);
			index++;
		}

	}

}
