package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_Commands 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		
		//Get Current window title
		String Page_title=driver.getTitle();
		System.out.println("Current Window Title is --> "+Page_title);
		
		//Get Current window url
		String Window_url=driver.getCurrentUrl();
		System.out.println("Current window url is --> "+Window_url);
		
		//Get Current Window ID
		String MainwindowID=driver.getWindowHandle();
		System.out.println("Current Window Id is --> "+MainwindowID);
		
		//Get Current Window Page Source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
	
		

	}

}
