package com.cloud.core;

public class GivenStringContainsOvel {
public static void main(String[] args) {
	String str1 = "country";

	 for(int i=0;i<str1.length();i++) {
	    	if(str1.charAt(i) =='a' ||str1.charAt(i) =='e' 
	    			||str1.charAt(i) =='i' ||
	    			str1.charAt(i) =='o'  || str1.charAt(i) =='u'  ) {
	    		 System.out.println("ovel ");
	    		
	    	}
	    	else {
	    		System.out.println("consonent");
	    	}
	 }
}
}
