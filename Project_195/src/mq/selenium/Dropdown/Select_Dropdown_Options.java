package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Select_Dropdown_Options 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
	
		new Select(driver.findElement(By.name("birthday_day")))
		.selectByVisibleText("15");
		
		//Selecting dropdown using click method
		WebElement June_month=driver.findElement(By.xpath("//option[@value='6'][contains(.,'Jun')]"));
		June_month.click();
		
		//Selecting dropdown option using index number..
		WebElement DOB_Year=driver.findElement(By.id("year"));
		new Select(DOB_Year).selectByIndex(21);
		
		
		
		
	}

}
