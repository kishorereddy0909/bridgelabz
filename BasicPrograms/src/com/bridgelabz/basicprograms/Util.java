package com.bridgelabz.basicprograms;

import java.util.Random;

public class Util {
	
	public static void primeFactorOf(int number) {
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				//System.out.println(i);
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
    	
    }
	public static boolean isPrime(int n) {
		int count=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			return true;
		}
		return false;	
	}
	
	static void flipCoin(int n) {
		 
		double a1 = 0;
		int tails = 0;
		int heads = 0;
		Random rand = new Random();
	    for(int i=0;i<=n-1;i++) {
	        a1 = rand.nextDouble();
	    	System.out.println(a1);
	    	if(a1<0.5) {
	    		tails++;
	    		
	    	}else {
	    		heads++;
	    		
	    	}
	    }
	    	System.out.println(tails);
	    	System.out.println(heads);
	      double p1 = tails/(double)n *100;
	      double p2 = heads/(double)n *100;
	      System.out.println(p1);
	      System.out.println(p2);
	}
	
	static double harmonicNumber(int n) {
		
		int a=1;
		double sum = 0;
		for(int i=1;i<=n;i++) {
			double res = a + 1/i;
			System.out.println(res);
			sum+=res;
			//System.out.println(sum);
		}
		return sum;
	}
	

	static void leapYear(int year) {
		
		if(year % 4==0 || year % 400==0) {
			System.out.println("Enter "+ year +" was leap year ");
		}else {
			System.out.println(" it is not leap year");
		
		}
		
	}
	
	static int powerOfTwo(int num , int power) {
		int a1=1;
		for(int j=1;j<=power;j++) {
			a1 = a1*num;
			System.out.println(a1);
		}
		return a1;
	}
	
	static String stringReplace(String UserName) {
		String str = "Hello";
		str = str+" "+UserName;
		return str;
	}

}
