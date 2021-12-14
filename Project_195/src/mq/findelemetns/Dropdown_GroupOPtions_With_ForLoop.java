package findelemetns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_GroupOPtions_With_ForLoop {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Finding list of options tags unde dropdown
		List<WebElement> AllOptions=Dropdown.findElements(By.tagName("option"));
		//Remove First Index options
		AllOptions.remove(0);
		
		
		for (int i = 0; i < AllOptions.size(); i++)
		{
				//Get Each Element Using Index Number
				WebElement EachOption=AllOptions.get(i);
				System.out.println(EachOption.getText());
				
				//Click on each option
				EachOption.click();
				Thread.sleep(300);
		}
		

	}

}
