package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Verify_Title_Presented 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://facebook.com");
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(40))
			.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
			System.out.println("Expected title is presented");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		WebElement Signup=driver.findElement(By.linkText("Sign Up"));
		Signup.click();
		
		boolean flag=false;
		try {
			 flag=new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.titleContains("Sign up"));
			 System.out.println("Expected Title is presented");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(flag==true)
		{
			System.out.println("Registration Entry");
		}
		else
		{
			System.out.println("Wrong title presented for page");
		}
	

	}

}
