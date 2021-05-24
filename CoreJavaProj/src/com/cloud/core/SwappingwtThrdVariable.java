package com.cloud.core;

public class SwappingwtThrdVariable {
public static void main(String...add) {
	Integer a=10;
	Integer b=20;
	System.out.println("before swawwing a and b values are: "+a+" & "+b);
	/*
	 * Integer third=a; a=b; b=third;
	 */
	a=a+b;
	b=a-b;
	a=a-b;
	
	
	System.out.println(a+ "  "+b);
}
}
