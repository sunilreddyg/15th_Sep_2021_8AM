package ui_verificationcommands.getcssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_Testing 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		
		
		Color objColor=Color.fromString(Roundtrip.getCssValue("color"));
		System.out.println("Color in Hex format is --> "+objColor.asHex());
		System.out.println("Color in RGB format is --> "+objColor.asRgb());
		System.out.println("Color in RGBA format is --> "+objColor.asRgba());
		
		if("#9b9b9b".equals(objColor.asHex()))
			System.out.println("Expected color is displayed");
		else
			System.out.println("Expected color is not displayed");
		
		
	}

}
