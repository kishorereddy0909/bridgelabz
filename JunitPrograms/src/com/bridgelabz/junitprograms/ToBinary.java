package com.bridgelabz.junitprograms;

import java.util.Scanner;

public class ToBinary {
	/*
	 * swapping elements
	 */
	private static int[] swapNibbels(int[] swaparr) {
		int temp, j = swaparr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = swaparr[i];
			swaparr[i] = swaparr[j];
			swaparr[j] = temp;
			j++;
		}
		return swaparr;
	}

	/*
	 * printing array
	 */
	static void printArray(int[] binary) {
		for (int i = 0; i < binary.length; i++) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		sc.close();
		int[] binary = Util.toBinary(num);
		System.out.println("binary is :");
		printArray(binary);
		swapNibbels(binary);
		System.out.println("after swapping :");
		printArray(binary);
		int d = Util.toDecimal(binary);
		System.out.println(d);
		if (Util.powerOfTwo(d)) {
			System.out.println("it is power of two ");
		} else {
			System.out.println("it is not power of two ");
		}
	}
}
