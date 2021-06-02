package com.cloud.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
    
	public static void main(String[] args) {
		 Map<Integer,String> map=new HashMap<>();
	     map.put(1, "aAkshay");
	     map.put(4, "hagawa");
	     map.put(2, "ss");
	     map.put(3, "sa");
	     Iterator<Entry<Integer,String>> itr=map.entrySet().iterator();
	     while(itr.hasNext()) {
	    	 Map.Entry<Integer, String> set=(Map.Entry<Integer, String>)itr.next();
	    	 System.out.println(set.getKey()+"   "+set.getValue());
	     }
	    // map.forEach(key,val)->;
	     //System.out.println(map.get(1));
		/*
		 * Thread t1=new Threading(); Thread t2=new Threading(); Thread t3=new
		 * Threading(); Thread t4=new Threading(); Thread t5=new Threading();
		 * t1.start();
		 */
           
	}

}
class Threading extends Thread{
   public void run() {
	   System.out.println("Threading.run()"+Thread.currentThread().getName());
	  
   }
   //public void 
}
