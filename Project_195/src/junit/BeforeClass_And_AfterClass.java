package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Invoke before execution of first @Test annotation with in class
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass //Invoke after last @Test execution with in class
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}

	@Test  //Invoke method to run  [Junit generate result only for @Test methods]
	public void test()
	{
		System.out.println("Test Executed");
	}
	
	@Test  //Invoke method to run  [Junit generate result only for @Test methods]
	public void test2()
	{
		System.out.println("Test2 Executed");
	}
	
	@Test  //Invoke method to run  [Junit generate result only for @Test methods]
	public void test3()
	{
		System.out.println("Test3 Executed");
	}

}
