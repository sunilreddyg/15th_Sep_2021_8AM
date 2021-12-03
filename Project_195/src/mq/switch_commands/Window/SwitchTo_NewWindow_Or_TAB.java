package switch_commands.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_NewWindow_Or_TAB 
{

	public static void main(String[] args)
	{
		
		//Only Selenium 4 had feature to open a page in new window or tab
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle());
	    
	    
	    WebDriver new_driver=driver.switchTo().newWindow(WindowType.WINDOW);
	    new_driver.get("https://www.instagram.com/directory/hashtags/");
	 
	    System.out.println(new_driver.getTitle());
	    
	 
	    WebDriver New_Tab=driver.switchTo().newWindow(WindowType.TAB);
	    New_Tab.get("https://www.instagram.com/accounts/emailsignup/");
	    System.out.println(New_Tab.getTitle());
	  

	}

}
