package ui_verificationcommands.getcssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Object_Styles 
{

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		
		String Color_Before_Selection=Roundtrip.getCssValue("color");
		System.out.println(Color_Before_Selection);
		
		Roundtrip.click();
		
		String Color_After_Selection=Roundtrip.getCssValue("color");
		System.out.println(Color_After_Selection);
		
		
		//Check Font size
		String fontsize=Roundtrip.getCssValue("font-size");
		String transform=Roundtrip.getCssValue("text-transform");
		
		System.out.println("object font size is --> "+fontsize);
		System.out.println("Object font Transform is --> "+transform);
		

	}

}
