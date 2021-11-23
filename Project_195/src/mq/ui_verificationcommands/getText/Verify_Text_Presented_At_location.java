package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Presented_At_location {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Actual_text=Error_location.getText();
		System.out.println(Actual_text);
		
		String Exp_text="Enter a valid email address, phone number, or Skype name.";
		
		
		if(Actual_text.equals(Exp_text))
			System.out.println("Testpass, Expected Error message visible at webpage");
		else
			System.out.println("Testfail, Expected error message not visible at webpage");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
