package interactions.TouchActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Touch_Interactions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		WebElement Item1=driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		
		//Create object for Touch Actions
		TouchActions action=new TouchActions(driver);
		
		//Analog left click action at mouse
		action.singleTap(Item1).perform();
		
		
		
	}

}
