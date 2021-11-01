package mq.java.methods.staticmethods;

import org.openqa.selenium.By;

public class NativeINputs 
{
	//Static Methods
	public static void keyboard()
	{
		System.out.println("keyboard is executed");
	}
	
	//Static Methods
	public static void mouse()
	{
		System.out.println("Mouse is executed");
	}
	
	public void touchfeatures()
	{
		keyboard();
		mouse();
	}

	public static void main(String[] args) 
	{
		
		keyboard();
		mouse();
		
		

	}

}
