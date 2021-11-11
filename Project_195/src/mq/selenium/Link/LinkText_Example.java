package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_Example {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//Clicking location using original linkname
		driver.findElement(By.linkText("Locations")).click();
		
		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Kolkata")).click();
		
		//clicking link using partial linkname
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Amar Kolkata")).click();
		
		
	}

}
