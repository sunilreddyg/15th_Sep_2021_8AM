package objectidentification.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Attribute_And_Text {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/free-job-alerts");
		Thread.sleep(4000);
		
		
		WebElement Keywords_EntyBox=driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']"));
		Keywords_EntyBox.sendKeys("Software Testing");

		
		driver.findElement(By.xpath("//div[.='Software Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		
	}

}
