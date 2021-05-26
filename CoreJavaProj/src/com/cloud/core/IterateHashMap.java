package com.cloud.core;

import java.util.HashMap;

public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<String,Object> map=new HashMap<String, Object>();
		map.put("name", "akshay");
		map.put("addrs","hyd");
		System.out.println("key   "+"     value");
		map.forEach((key,val)->{
			System.out.println(key+"     "+val);
		});

	}

}
