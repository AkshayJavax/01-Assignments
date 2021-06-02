package com.cloud.core;

import java.util.Arrays;

public class ArrayHavingSameElementorNot {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,3,2,3};
		int[] arr2= {3,2,3,4,2,3};
		boolean checkEquality = checkEquality(arr1, arr2);
		if(checkEquality) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}
	public static boolean checkEquality(int[] a,int[] b) {
		Arrays.sort(a);Arrays.sort(b);
		int n=a.length;int m=b.length;
		if(n!=m) {
		  return false;
		}
		for(int x=0;x<a.length;x++) {
			if(a[x]!=b[x]) {
				return false;
			}
		}
		return true;
	}

}
