package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many times do you want to flip the coin :");
	    int number = sc.nextInt();
	    sc.close();
	    Util.flipCoin(number);
	}

}
