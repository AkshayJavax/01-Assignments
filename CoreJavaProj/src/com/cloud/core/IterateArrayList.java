package com.cloud.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("akshay");
		list.add("Bhagawan");
		list.add("Kokane");
		list.add("Arvind");
		Iterator itr=list.iterator();
		/*
		 * while(itr.hasNext()) { Object next = itr.next(); System.out.println(next); }
		 */
		/*
		 * for(int i=0;i<=list.size()-1;i++) { System.out.println(list.get(i)); }
		 */		list.forEach(lst->{
			System.out.println(lst);
		});

	}

}
