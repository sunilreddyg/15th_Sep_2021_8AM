package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Left_And_Right_Identifications {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		driver.findElement(RelativeLocator.with
				(By.tagName("select")).toLeftOf(By.id("month")))
				.click();
		Thread.sleep(3000);
		
		
		driver.findElement(RelativeLocator.with
				(By.tagName("select")).toRightOf(By.id("month")))
				.click();
		Thread.sleep(3000);
		
		
		driver.findElement(RelativeLocator.with
				(By.tagName("label")).near(By.xpath("//input[@value='2']"))).click();
			

	}

}
