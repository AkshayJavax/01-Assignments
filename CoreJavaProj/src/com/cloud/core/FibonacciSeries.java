package com.cloud.core;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		  //    IF VALUE IS 5      O/P WILL BE          0,+1,+1,+2,3
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter count");
		int count=sc.nextInt();
		int a=0,b=1;
		System.out.println(a);
		for(int i=2;i<=count;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			//System.out.println(a+" "+b+" "+c);
		}

	}

}
