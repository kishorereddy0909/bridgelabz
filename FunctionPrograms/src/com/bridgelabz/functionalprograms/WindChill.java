package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the tempareture  and wind speed :");
		double t = sc.nextDouble();
		double v = sc.nextDouble();
		sc.close();
		System.out.println(Util.temparetureOf(t, v));
	}

}
