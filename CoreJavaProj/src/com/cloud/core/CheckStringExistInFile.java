package com.cloud.core;

import java.io.FileInputStream;
import java.util.Scanner;

public class CheckStringExistInFile {

	public static void main(String[] args) {
		try {
			System.out.println(checkString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 public  static String checkString()throws Exception {
	//Path of your file
    
     Scanner sc=new Scanner(new FileInputStream("std.txt"));
     boolean flag=true;
     Scanner input=new Scanner(System.in);
     System.out.println("enter word to found present or not");
     String word=input.next();
     while(sc.hasNextLine()) {
    	 String nextLine = sc.nextLine();
    	 System.out.println(nextLine);
    	 if(nextLine.indexOf(word)==-1) {
    		 flag=false;
    	 }
     }
     if(flag) {
    	return "yes";
     }
     else {
    	 return "no";
     }
   
 }
}
