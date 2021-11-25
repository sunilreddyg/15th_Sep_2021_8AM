package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Input_From_Textbox 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement Origin_textbox=driver.findElement(By.name("fsc-origin-search"));
		String InputValue=Origin_textbox.getAttribute("value");
		System.out.println(InputValue);
		
		
		if(InputValue.equals("Hyderabad (HYD)"))
			System.out.println("Testpass, Expected City Displayed on browser launch");
		else
			System.out.println("Testfail, Expected city not displayed on browser launch");
		

	}

}
