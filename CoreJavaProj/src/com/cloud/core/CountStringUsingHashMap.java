package com.cloud.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountStringUsingHashMap {
public static void main(String[] args) {
	System.out.println("CountStringUsingHashMap.main()");
	Map<String,String> map=new HashMap<>();
	map.put("name", "Akshay");map.put("addr", "hyd");map.put("crs", "Akshay");
	Iterator itr= map.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry me = (Entry) itr.next();
		System.out.println("keys are : "+me.getKey()+"  "+me.getValue() );
	}
}
}
