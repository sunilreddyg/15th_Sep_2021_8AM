package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
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
  
  @BeforeClass //Invoke before execution of first @Test annotation
  public void beforeClass() 
  {
	  System.out.println("Class PreCondition");
  }

  @AfterClass  //Invoke after execution fo last @Test annotation
  public void afterClass() 
  {
	  System.out.println("Class PostCondition");
  }

}
