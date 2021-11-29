package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selection_Type_Ismultiple {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * Given Site url http://bridgeqsystems.com/demo.php
		 * Then click on Menu link
		 * Then Verify dropdown is a multiple selection type
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Clicking menu link
		WebElement Menu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Menu_link.click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("Multple Selection status is --> "+flag);
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Multiple Selection Status is --> "+flag1);
		
		
		if(flag1==true)
			System.out.println("Testapss, Dropdown is multiple selection type");
		else
			System.out.println("Testfail, Dropdown is not a miltiple selection type");
	}

}
