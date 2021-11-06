package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> under Chrome browser click on documentation link
		 * 		=> Check what version of chrome browser is installed
		 * 	
		 * 					Open ChromeBrowser --> click on settings
		 * 					---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser versino
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to back location
		 * 		=> After unzip you receive .exe file then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
		
		//Setting Runtime environment variable for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		
		//Launching chrome browser and storing into reference
		ChromeDriver chrome=new ChromeDriver();
		
		//Loading new page to browser window
		chrome.get("http://facebook.com");
		
		//Printing title of page
		System.out.println(chrome.getTitle());
		
		//Closing chrome browser
		chrome.close();

	}

}
