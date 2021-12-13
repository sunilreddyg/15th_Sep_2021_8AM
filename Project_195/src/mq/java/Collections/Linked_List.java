package mq.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) 
	{
		
		 List<String> list=new LinkedList<>();
		 list.add("one");
		 list.add("two");
		 list.add("three");
		 list.add("four");
		 list.add("five");
		 list.add("six");
		 list.add("two");
		 
		 
		 //Get Any single object using index number
		 String singleobject=list.get(3);
		 System.out.println("Single object at 3rd index position --->"+singleobject);
		 
		 //Remove any single object from collection
		 list.remove("four");
		 
		 //Get size of collection
		 int ObjCount=list.size();
		 System.out.println("Number of objects available is --> "+ObjCount);
		 
		 //Verify Object Available at collecton
		 boolean flag=list.contains("four");
		 System.out.println("Object Status is --> "+flag);
		 
		
		 //Verify Collection Empty Status
		 boolean flag1=list.isEmpty();
		 System.out.println("Collection Empty Status is -->"+flag1);
		 
		 //Read Next Iterator Value
		 String itr=list.iterator().next();
		 System.out.println("First Iterator value of collection class is ---> "+itr);
		 
		 //Read list of object using for loop
		 for (int i = 0; i < list.size(); i++) 
		 {
			   String nextobj= list.get(i);
			   System.out.println("=>"+nextobj);
		 }
		 
		
		 
		 //Read collection of object using foreach loop
		 for (String Eachobj : list) 
		 {
			 System.out.println(Eachobj);
		 }
		 
		 
		 //Convert all Collection Into Iteratables
		 Iterator<String> iterator=list.iterator();
		 
		 //Read First object
		 String first=iterator.next();
		 String seconds=iterator.next();
		 System.out.println(first+"\t"+seconds);
		 
		 //Using Conditional loop to read all objects
		 while(iterator.hasNext())
		 {
			 String objectname=iterator.next();
			 System.out.println(objectname);
		 }
		 
	}

}
