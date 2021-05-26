package com.cloud.core;

import java.util.ArrayList;
import java.util.Scanner;

public class FIndUnique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> d=new ArrayList<Integer>();
		
		ArrayList<Integer> e=new ArrayList<Integer>();
		
		
		do {
			System.out.println();System.out.println();
			System.out.println("press 1 for common element");
			System.out.println("press 2 for unique element");
			System.out.println("press 3 for exit");
		
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			d.add(1);
			d.add(2);
			d.add(3);
			d.add(4);d.add(5);
			e.add(4);
			e.add(5);
			e.add(6);
			e.add(7);e.add(8);
			d.retainAll(e);
			System.out.println("common elements are");
			for(int u:d){
				System.out.print(u+" , ");
				
			}//for
	    break;
		case 2: 
			d.add(1);
			d.add(2);
			d.add(3);
			d.add(4);d.add(5);
			e.add(4);
			e.add(5);
			e.add(6);
			e.add(7);e.add(8);
			d.removeAll(e);
			System.out.println("these are unique elemnts fount");
			 for(int t:d){
				 
			    System.out.print(t+",  ");//we will get the unique
			}//for
         break;
		case 3:
			System.exit(3);
		}
		
		
		}while(true);
	}

}
