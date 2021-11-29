package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Count {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Given Site url https://www.cleartrip.com/
		 * When user select one adult
		 * Then verify child dropdown only contains 8 Options
		 * And verify infant dropdown only contains 1 Option
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Adults=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		WebElement Children=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		WebElement Infants=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[3]"));
		
		
		//Select Adults dropdown
		new Select(Adults).selectByVisibleText("1");
		Thread.sleep(2000);
		
		int ChildrensCount=new Select(Children).getOptions().size();
		if(ChildrensCount == 9)
			System.out.println("Expected Count is matching");
		else
			System.out.println("Expected count is mismatch");
		
		
		
		int InfantCount=new Select(Infants).getOptions().size();
		if(InfantCount ==2)
			System.out.println("expected count is matching");
		else
			System.out.println("Expected count is not matching");
	}

}
