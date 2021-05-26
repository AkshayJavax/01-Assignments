package com.cloud.core;

import java.util.Scanner;

public class CharacterOccurCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String input = sc.next();
		System.out.println("enter character");
		  char search =  sc.next().charAt(0);             // Character to search is 'a'.
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");

	}

}
