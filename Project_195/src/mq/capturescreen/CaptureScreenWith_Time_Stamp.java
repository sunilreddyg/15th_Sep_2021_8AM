package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenWith_Time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	   //Get System default date
	    Date d=new Date();
	    //Create Simple date format
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
	    //Convert Default date using simple formatter
	    String time=sdf.format(d);
	    
	    
	    
	    //Capture screen convert into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Copy file to Required Location
	    FileHandler.copy(src, new File("screens\\image"+time+".png"));

	    

	}

}
