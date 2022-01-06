package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore 
{
  @Test(priority=1)
  public void banker_login() 
  {
	  Reporter.log("tc001 method executed",true);
  }
  
  
  @Test(priority=2,enabled=false)   //Enabled property ignore method execution
  public void admin_login() 
  {
	  Reporter.log("tc002 method executed",true);
  }
  
  
  public void Customer_login() 
  {
	  Reporter.log("tc002 method executed",true);
  }
  
  
}

