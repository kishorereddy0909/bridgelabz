package com.bridgelabz.junitprograms;

import java.util.Scanner;

public class VendingMachine {

	static int TOTAL, I;
	static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	private static int noOfNotes;

	static void findRemainAmount(int value, int prodvalue) {
		if (value >= prodvalue) {
			TOTAL = value - prodvalue;
			if (TOTAL == 0) {
				System.out.println("returning amount : " + TOTAL + " THANK YOU!");
			}
			// calling change method
			returnAmount(TOTAL);
		} else {
			System.out.println("enter sufficient amount! try again..");
		}
	}

	private static void returnAmount(int TOTAL) {
		if (TOTAL / NOTES[I] != 0) {
			noOfNotes += (TOTAL / NOTES[I]);
			System.out.println(NOTES[I] + " Rs notes :" + TOTAL / NOTES[I]);
			TOTAL = TOTAL % NOTES[I];
		}
		I++;
		if (TOTAL == 0) {
			System.out.println("total notes :" + noOfNotes);
			return;
		}
		returnAmount(TOTAL);

	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of amount :");
			int value = sc.nextInt();
			System.out.println("enter the product amount which you want to buy :");
			int prodvalue = sc.nextInt();
			findRemainAmount(value, prodvalue);
			sc.close();
		} catch (Exception e) {
			System.out.println("enter the amount in integer");
		}

	}

}
