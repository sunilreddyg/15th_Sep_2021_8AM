package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_And_AfterMethod {
 
	
  @Test
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed ",true);
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed ",true);
  }
  
  
  @BeforeMethod  //Invoke ever @Test annotated method before
  public void beforeMethod() 
  {
	  System.out.println("Method PreCondition");
  }

  @AfterMethod   //Invoke every after @Test annotated method
  public void afterMethod() 
  {
	  System.out.println("Method postCondition");
  }

}
