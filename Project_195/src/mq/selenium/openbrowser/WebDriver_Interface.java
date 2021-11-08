package mq.selenium.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface 
{

	public static void main(String[] args) 
	{
		
		String driverPath="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		/*
		 * WebDriver:--> 
		 * 			WebDriver is a interface class it is implemented
		 * 			all browser instances support by Selenium.
		 * 
		 * 			WebDriver methods are usefull to automate
		 * 			different browsers like [Chrome,Safari,Opera ---etc]
		 */
	
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 			=> This exception we receive when don't define
		 * 				environment path for browser drivers
		 * 							[OR]
		 * 
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 
		 * 		
		 * 		InvalidArgumentException:-->
		 * 				=> When url format is mimstached
		 * 				=> Url should start with http://  or https://
		 */
		
		
		
	}

}
