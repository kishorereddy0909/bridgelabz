package com.bridgelabz.algorithmsproblems;

import java.util.Scanner;

public class TaskAccomplish {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of task");
		int tasks = sc.nextInt();
		int[] dead = new int[tasks] ;
		int[] min = new int[tasks] ;
		for (int i = 0; i < min.length; i++) {
			System.out.println("task " +i+ " time");
			min[i] = sc.nextInt();
			System.out.println("task "+i+" deadline");
			dead[i] = sc.nextInt();
			sc.close();
		}

	}

}
