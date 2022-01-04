package framework.junit;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreMethod_Execution 
{
	
	
	@Test   //Invoke method execution
	public void tc001()
	{
		Assert.assertEquals("Login", "Login");
		System.out.println("Login verified");
		tc003();
	}
	
	@Ignore  //Ignore test execution
	public void tc002()
	{
		Assert.assertEquals("inbox", "inbox");
		System.out.println("inbox unread mail are verifed");
		
	}
	
	
	
	public void tc003()
	{
		System.out.println("tc003 Verified");
	}
	

}
