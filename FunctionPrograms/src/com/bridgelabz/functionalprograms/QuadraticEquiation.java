package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class QuadraticEquiation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of a , b , c :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		Util.quadraticEquiation(a,b,c);
	}

}
