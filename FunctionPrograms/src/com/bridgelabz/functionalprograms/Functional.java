package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Functional {

	public static void main(String[] args) {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number which program do you want to execute :");
			System.out.println(
					"1.Distance \n2.Quadratic Equiation \n3.SumOfIntegers \n4.TwoDimentionalArray \n5.WindChill");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter the elements of x and y :");
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				
				System.out.println("distance from ("+x+","+y+") to (0,0) " +Util.distanceOf(x, y));
				break; 
				
			case 2:
				System.out.println("enter the elements of a , b , c :");
				double a= sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				Util.quadraticEquiation(a,b,c);
				break;
				
			case 3:
				System.out.println("enter the size of array :");
				int size = sc.nextInt();
				int[] arr = new int[size];
				for(int i=0;i<arr.length;i++) {
					System.out.println("enter the elements :");
					arr[i]=sc.nextInt();
				}
				Util.sumOfInteger(arr);
				break;
				
			case 4:
				System.out.println("Enter the size of a array :");
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				int[][] arr1 = new int[a1][a2];
				for(int i=0;i<arr1.length;i++) {
					for(int j=0;j<arr1.length;j++) {
						System.out.println("enter the elements into array :");
						arr1[i][j]=sc.nextInt();
					
					}
				}
				Util.twoDimentionArray(arr1);
				break;
				
			case 5:
				System.out.println("enter the tempareture  and wind speed :");
				double t = sc.nextDouble();
				double v = sc.nextDouble();
				sc.close();
				System.out.println(Util.temparetureOf(t, v));
				break;
				
			default:
				System.out.println("enter the range between only 1-5");
				break;
				
			}
		} while (true);
	}

}
