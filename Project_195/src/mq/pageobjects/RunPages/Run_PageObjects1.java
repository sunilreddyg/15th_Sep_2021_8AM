package pageobjects.RunPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Pages.HRM_LoginPage;

public class Run_PageObjects1
{
	
	public static void main(String[] args)
	{
		String path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		if(login.username.isDisplayed())
		{
			login.userlogin("Admin","admin123");
		}
		else
		{
			System.out.println("login button is not displayed");
		}
		
		
		driver.findElement(By.xpath("/html/body/div/input[1]")).clear();
		login.click_forgotpassword();
		

	}

}
