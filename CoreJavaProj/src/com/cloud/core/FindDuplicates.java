package com.cloud.core;

import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		 String str = sc.next();
         int count = 0;
         char[] chars = str.toCharArray();
         System.out.println("Duplicate characters are:");
         for (int i=0; i<str.length();i++) {
                     for(int j=i+1; j<str.length();j++) {
                                if (chars[i] == chars[j]) {
                                           System.out.println(chars[j]);
                                           count++;
                                           break;
                                 }
                      }
          }

	}

}
