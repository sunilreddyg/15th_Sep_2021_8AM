package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeText_Using_JavaScript 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='Darshan@gmail.com'");
		
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('pass').value='Darshan@gmail.com'");
		
		WebElement Login=driver.findElement(By.name("login"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].click()", Login);
		
		
		
		
		
		

	}

}
