package com.cloud.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



//  WE CAN USE DIRECTLY PREDEFINE METHOD CONTAINS(NO.)   


public class CheckElementExistInList {

	public static void main(String[] args) {
		
		//Iterator itr=of.iterator();
		
		System.out.println("press 1 for char");
		System.out.println("press 2 for string");
   Scanner sc=new Scanner(System.in);
   int opt=sc.nextInt();
  
   
   List<String> list=new ArrayList();
 		List<String> of = List.of("akshay","Bhagawan");
 		for(int i=0;i<of.size();i++) {
      switch(opt) {
    
      case 1 : //System.out.println("enter char to know present or not");
      
    	  
    	   char charAt = of.get(i).charAt(i); 
		if(charAt=='h') {
			System.out.println("char present on index "+of.indexOf(of.get(i)));
		}
		 else {
   		  System.out.println("not present on index "+of.indexOf(of.get(i)));
   	  }
		break;
    	  
      case 2 : //System.out.println("enter string to know present or not"); 	
    //  String str=sc.next();;
      
    	  
    	  if(of.get(i)=="Bhagawan") {
			System.out.println("string present on index "+of.indexOf(of.get(i)));
		}
    	  else {
    		  System.out.println("not present on index "+of.indexOf(of.get(i)));
    	  }
      break;
      }
     
      }
			
		
		}
		

	}


