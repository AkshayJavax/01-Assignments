package com.cloud.core;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<String,Object> map=new HashMap<String, Object>();
		map.put("name", "akshay");
		map.put("addrs","hyd");
		System.out.println("key   "+"     value");
		/*
		 * map.forEach((key,val)->{ System.out.println(key+"     "+val); });
		 */
		
		java.util.Iterator<Entry<String, Object>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Object> next = itr.next();
			System.out.println(next.getKey()+"    "+next.getValue());
		}

	}

}
