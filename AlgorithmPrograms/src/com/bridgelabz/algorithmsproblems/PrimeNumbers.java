package com.bridgelabz.algorithmsproblems;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find primenumbers :");
		int num = sc.nextInt();
		sc.close();
		Util.primeNumbersOf(num);
	}

}
