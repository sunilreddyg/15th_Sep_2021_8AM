package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenOn_Element {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Target location and capture screen on it
	    WebElement Login_form=driver.findElement(By.xpath("//div[contains(@class,'gr27e  ')]"));
	    File src=Login_form.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("screens\\singinform.png"));
	    
	    

	    
	    
	}

}
