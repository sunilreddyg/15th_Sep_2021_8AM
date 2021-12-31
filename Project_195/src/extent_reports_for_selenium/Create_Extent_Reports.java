package extent_reports_for_selenium;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args) 
	{
		
		String filepath="Reports\\Report1.html";
		//Create reporter file using html file format
		ExtentReports reporter=new ExtentReports(filepath, true);

		//Write all Data into Html file
		reporter.flush();
	}

}
