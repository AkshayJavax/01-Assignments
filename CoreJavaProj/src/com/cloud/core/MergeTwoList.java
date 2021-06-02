package com.cloud.core;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		List<String> of = List.of("Akshay","Bhagawan","kokane");
		List<String> of2 = List.of("Rahul","Akash");
		List<String> copyOf = new ArrayList();
		copyOf.addAll(of);
		
		copyOf.addAll(of2);
		System.out.println(copyOf);
		

	}

}
