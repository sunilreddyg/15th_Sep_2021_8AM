package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen1 {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    //Capture screen convert into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Create folder under project
	    FileHandler.createDir(new File("screens"));
	    //Copy file to Required Location
	    FileHandler.copy(src, new File("screens\\image.png"));

	}

}
