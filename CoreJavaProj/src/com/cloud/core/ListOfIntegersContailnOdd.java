package com.cloud.core;

import java.util.Scanner;

public class ListOfIntegersContailnOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			//System.out.println("enter list of integers");
			//arr[i]=sc.nextInt();
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+"  no. is odd");
			}
			else {
				System.out.println(arr[i]+"  no. is even");
			} 
		}

	}

}
