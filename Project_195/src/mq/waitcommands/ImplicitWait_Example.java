package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://facebook.com");
		
		
		long start_time=System.currentTimeMillis();
		
		try {
			driver.findElement(By.id("email"));
			System.out.println(System.currentTimeMillis()-start_time);
		} catch (Exception e) {
			System.out.println(System.currentTimeMillis()-start_time);
		}
		

	}

}
