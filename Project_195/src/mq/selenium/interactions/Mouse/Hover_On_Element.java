package interactions.Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_On_Element {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Peforming hover action on selected location
		WebElement Menu_Tools=driver.findElement(By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]"));
		new Actions(driver).moveToElement(Menu_Tools).perform();
		//Thread.sleep(2000);
		
		//Performing click action on selected location
		WebElement Create_list=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(Create_list).perform();

	}

}
