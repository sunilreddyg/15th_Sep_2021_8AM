package ui_verificationcommands.getcssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetLocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//Get Object x and y coordinates
		int Objx=RoundTrip.getLocation().getX();
		int Objy=RoundTrip.getLocation().getY();
		
		System.out.println("Object x value is --> "+Objx);
		System.out.println("Object y value is --> "+Objy);
		
		
		//Verify Object visibility using coordinates
		if(Objx >0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is Not visible at webpage");
		
		
		
		

	}

}
