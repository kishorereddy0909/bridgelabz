package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		sc.close();
		Util.primeFactorOf(number);
	}

}
