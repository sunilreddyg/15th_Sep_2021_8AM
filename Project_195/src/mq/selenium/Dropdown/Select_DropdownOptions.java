package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropdownOptions 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Delhi");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("new-delhi");
		Thread.sleep(4000);
		
		driver.findElement(By.id("customLocality"))
		.sendKeys("Gandhi Nagar");
		
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(4);
		
		
		
		
		
	}

}
