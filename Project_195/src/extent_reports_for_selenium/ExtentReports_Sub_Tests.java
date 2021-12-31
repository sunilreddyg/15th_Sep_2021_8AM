package extent_reports_for_selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_Sub_Tests {

	public static void main(String[] args) {
		
		//create extentreport html file at location
		String File_path="Reports\\Report4.html";
		ExtentReports logger=new ExtentReports(File_path, true);
		
				//Create test 
				ExtentTest test1=logger.startTest("Tc001_valid_login");
						test1.log(LogStatus.PASS, "Login valid pass");
				logger.endTest(test1);
				
				
				//Create test 
				ExtentTest test2=logger.startTest("Tc002_INvalid_login");
						test2.log(LogStatus.PASS, "Login Invalid pass");
				logger.endTest(test2);
				
				
				//Create Test
				ExtentTest login=logger.startTest("Login");
				
				logger.endTest(login);
				
				//Appending child test to parent
				login.appendChild(test1).appendChild(test2);
				
				
				
	
		//Write and Save file
		logger.flush();

	}

}
