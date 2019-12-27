package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class BasicPrograms {
	
	
	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number which program want to execute :");
			System.out.println(" 1.Factor\n 2.FlipACoin\n 3.HarmonicNumber\n 4.LeapYear\n 5.PowerOfTwo\n 6.ReplaceAString");
			int number = sc.nextInt();
			sc.close();
			switch (number) {
			case 1:
				System.out.println("Enter the number :");
				int n = sc.nextInt();
				Util.primeFactorOf(n);
				break;
			case 2:
				System.out.println("How many times do you want to flip the coin :");
				int n1 = sc.nextInt();
				Util.flipCoin(n1);
				break;
			case 3:
				System.out.println("Enter the N number: ");
				int n2 = sc.nextInt();
				System.out.println(Util.harmonicNumber(n2));
				break;
			case 4:
				System.out.println("Enter the year :");
				int year = sc.nextInt();
				Util.leapYear(year);
				break;
			case 5:
				System.out.println("enter the num:");
				int num = sc.nextInt();
				System.out.println("Enter the power :");
				int power = sc.nextInt();
				System.out.println(num + " power of " + power + " is :" + Util.powerOfTwo(num, power));
				break;
			case 6:
				System.out.println("Enter the username :");
				String UserName = sc.next();
				System.out.println(Util.stringReplace(UserName));
				break;
			default:
				System.out.println("enter the range between 1-6 only! ");
				break;

			}
		} while (true);

	}

}
