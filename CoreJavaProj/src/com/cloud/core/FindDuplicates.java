package com.cloud.core;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("enter string"); String
		 * str = sc.next(); int count = 0; char[] chars = str.toCharArray();
		 * System.out.println("Duplicate characters are:"); for (int i=0;
		 * i<str.length();i++) { for(int j=i+1; j<str.length();j++) { if (chars[i] ==
		 * chars[j]) { System.out.println(chars[j]); count++; break; } } }
		 */
		 
         
         
         Scanner sc1=new Scanner(System.in);
         System.out.println("enter string");
         String str1=sc1.next();
         char[] charArray = str1.toCharArray();
         for(int k=0;k<str1.length();k++) {
        	 for(int l=k+1;l<str1.length();l++) {
        	 if( charArray[k]== charArray[l]){
        		  System.out.println("duplicate char  "+charArray[l]);
        	 }
        	
        	 }
         }
         

	}

}
