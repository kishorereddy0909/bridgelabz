package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ElapsedTime {
	
	
	  static double start = 0;
	  static double stop = 0;
	  
	  public static void startTime() {
		  start = System.currentTimeMillis();
		  System.out.println("starting time :"+start);
		  }
	  public static void stopTime(){
		  stop = System.currentTimeMillis();
		  System.out.println("stoping time :"+stop);
		  }
	  static void elapsedTime(double start , double stop)
	  {
		  System.out.println("elapsed time is :"+(stop-start) / 1000 );
		  }
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to start the time ");
		sc.next();
		startTime();
		System.out.println("enter 0 to stop the time ");
		sc.next();
		stopTime();
		elapsedTime(start, stop);
		
		}

}
