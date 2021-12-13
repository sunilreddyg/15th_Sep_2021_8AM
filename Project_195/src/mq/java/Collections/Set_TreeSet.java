package mq.java.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) 
	{
		
		 Set<String> set=new TreeSet<String>();
		 set.add("one");
		 set.add("two");
		 set.add("three");
		 set.add("four");
		 set.add("five");
		 set.add("six");
		 set.add("two");
		 
		 //Remove any single object from collection
		 set.remove("four");
		 
		 //Get size of collection
		 int ObjCount=set.size();
		 System.out.println("Number of objects available is --> "+ObjCount);
		 
		 //Verify Object Available at collecton
		 boolean flag=set.contains("four");
		 System.out.println("Object Status is --> "+flag);
		 
		
		 //Verify Collection Empty Status
		 boolean flag1=set.isEmpty();
		 System.out.println("Collection Empty Status is -->"+flag1);
		 
		 //Read Next Iterator Value
		 String itr=set.iterator().next();
		 System.out.println("First Iterator value of collection class is ---> "+itr);
		 
		 
		 //Read collection of object using foreach loop
		 for (String Eachobj : set) 
		 {
			 System.out.println(Eachobj);
		 }
		 
		 
		 //Convert all Collection Into Iteratables
		 Iterator<String> iterator=set.iterator();
		 
		 //Read First object
		 String first=iterator.next();
		 String seconds=iterator.next();
		 
		 //Using Conditional loop to read all objects
		 while(iterator.hasNext())
		 {
			 String objectname=iterator.next();
			 System.out.println(objectname);
		 }
		 

	}

}
