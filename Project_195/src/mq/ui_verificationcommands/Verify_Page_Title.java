package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Page_Title {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		
		//Get Current window title
		String Page_title=driver.getTitle();
		System.out.println("Current Window Title is --> "+Page_title);
		
		String Expected_title="Selenium";

		if(Page_title.equals(Expected_title))
		{
			System.out.println("Testpass, Title Verified");
			WebElement Download=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			Download.click();
			Thread.sleep(2000);
			
			if(driver.getTitle().contains("Downloads"))
				System.out.println("StepPass, Download page title verified");
			else
				System.out.println("Downlaod page title not verified");
		}
		else
		{
			System.out.println("TestFail, Title mismatch");
		}
		
		
	}

}
