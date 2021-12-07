package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibility_of_Element_Located {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://facebook.com/");
		
		//enable explicit timeout on automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//Wait until object visible at page and type text init
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("Darshan");
		System.out.println("Email is visible at webpage");
		

	}

}
