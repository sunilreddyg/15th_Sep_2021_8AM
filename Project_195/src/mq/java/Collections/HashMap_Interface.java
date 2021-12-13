package mq.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Interface {

	public static void main(String[] args) 
	{
		
		  Map<Integer, String> map=new HashMap<Integer,String>();
		  map.put(100, "iphone");
		  map.put(101, null);
		  map.put(102, "Vivo");
		  map.put(null, null);
		  map.put(104, "OnePlus");
		  
		  for (Integer allkeys : map.keySet()) 
		  {
			  	System.out.println(map.get(allkeys));
		  }

	}

}
