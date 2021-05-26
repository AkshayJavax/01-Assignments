package com.cloud.core;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str1 = "I love My country";
		  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");//remove space
  
        System.out.println(str2);
  
         

	}

}
