package capturescreen;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollToView_And_CaptureScreen {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    
	    WebElement Meta_link=driver.findElement(By.linkText("Meta"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Meta_link);
	    
	    
	    
	    //Capture screen convert into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Copy file to Required Location
	    FileHandler.copy(src, new File("screens\\image.png"));

	}

}
