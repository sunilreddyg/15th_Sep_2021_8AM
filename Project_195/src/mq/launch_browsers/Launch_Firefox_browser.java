package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser {

	public static void main(String[] args) 
	{
		//Setting runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		//launching browser and store into reference
		FirefoxDriver firefox=new FirefoxDriver();
		
		//using browser reference loading webpage to current window
		firefox.get("http://facebook.com");
		
		//Print title of webpage
		System.out.println(firefox.getTitle());
		
		//Closing Browser window
		firefox.close();

	}

}
