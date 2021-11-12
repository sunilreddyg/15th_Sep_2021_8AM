package mq.selenium.AutoCompleteEdtibox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_Suggessions {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		WebElement OriginCityTextbox=driver.findElement(By.id("fsc-origin-search"));
		OriginCityTextbox.click();
		OriginCityTextbox.sendKeys(Keys.BACK_SPACE);
		OriginCityTextbox.sendKeys("HYD");
		driver.findElement(By.xpath("(//span[contains(.,'erabad (')])[2]")).click();
		
		
		WebElement DestinationTextbox=driver.findElement(By.id("fsc-destination-search"));
		DestinationTextbox.sendKeys("DEL");
		driver.findElement(By.xpath("(//span[contains(.,'hi (')])[2]")).click();
	}

}
