package com.cloud.core;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)       //      LOOP START FROM LAST INDEX  TO FIRST   (LENGTH CALULATE FROM 1   AND LOOP START FROM INDEX 0)
        {
            b = b + a.charAt(i);               //REVERSE OF A = B
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }

	}

}
