package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_validations 
{
	
	@Test
	public void tc001()
	{
		Assert.assertEquals("login1", "login");
		Reporter.log("login comparision is true");
	}
	
	@Test
	public void tc002()
	{
		Assert.assertTrue(true);
		Reporter.log("Tc002 is failed");
	}
	
	
	
	


}
