package framework.junit;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_AfterMethod 
{

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Test PreConditon");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("Test PostCondition"+"\n");
	}

	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3 executed");
	}
	
	@BeforeClass //Invoke before execution of first @Test annotation with in class
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

}
