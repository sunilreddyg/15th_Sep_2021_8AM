package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Changes {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement Element=driver.findElement(By.id("email"));

		js.executeScript("arguments[0].style.visibility='hidden'", Element);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].style.visibility='visible'", Element);
		Thread.sleep(5000);
		
		
	}

}
