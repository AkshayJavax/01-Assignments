package com.cloud.core;

public class ReverseStringDiff {

	public static void main(String[] args) {
		String name="hello world";
		System.out.println(name);
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.println("ReverseString.main()");
			char ch=name.charAt(i);
			System.out.print(ch);
		}

	}

}
