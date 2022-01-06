package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  @Test  //Invoke method to run
  public void tc001() 
  {
	  Reporter.log("Tc001 Registration is Completed");   //It prints output in html file only
  }
  
  @Test  //Invoke method to run
  public void tc002() 
  {
	  Reporter.log("Tc002 Signin is Completed",true);  //It print report in html file and Console
  }
  
  
  @Test  //Invoke method to run
  public void tc003() 
  {
	  Reporter.log("Tc003 COmposeEmail is Completed");
  }
  
  
}
