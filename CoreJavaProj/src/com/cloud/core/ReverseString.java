package com.cloud.core;

public class ReverseString {

	public static void main(String[] args) {
		String name="hello world";
		
		int ind=name.indexOf(" ");
		//String sub1=name.startsWith(" ")
		String sub=name.substring(0, ind);
		for(int i=sub.length()-1;i>=0;i--) {

			char ch=name.charAt(i);
            System.out.print(ch);
		}
		System.out.print("  ");
		String str=name.substring(name.indexOf(" "), name.length());
		for(int j=str.length()-1;j>=0;j--) {

			char ch1=str.charAt(j);
			//System.out.println();

			System.out.print(ch1);


		}

	}

}
