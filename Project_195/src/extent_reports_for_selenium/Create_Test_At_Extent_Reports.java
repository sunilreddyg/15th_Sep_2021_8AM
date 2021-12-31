package extent_reports_for_selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_Extent_Reports {

	public static void main(String[] args) 
	{

		String filepath="Reports\\Report2.html";
		//Create reporter file using html file format
		ExtentReports reporter=new ExtentReports(filepath, true);
		
			//Create New Test
			ExtentTest test1=reporter.startTest("Tcoo1_Login_valid");
						
			reporter.endTest(test1);
			
			//Create New Test
			ExtentTest test2=reporter.startTest("Tcoo2_Login_Invalid");
			
			reporter.endTest(test2);
				
		//Flush all runtime generated reports to html file..
		reporter.flush();

	}

}
