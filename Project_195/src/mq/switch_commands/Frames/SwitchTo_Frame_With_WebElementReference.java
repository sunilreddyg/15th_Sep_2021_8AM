package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_With_WebElementReference 
{

	public static void main(String[] args) 
	{
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    
	    WebElement BusHire=driver.findElement(By.xpath("//a[@id='redBus Bus Hire']"));
	    BusHire.click();
	    
	    //Switch to frame using WebElement Reference
	    WebElement FrameElement=driver.findElement(By.xpath("//object[@data-radium='true']"));
	    driver.switchTo().frame(FrameElement);
	    System.out.println("Switch Successfull");
	    
	    WebElement Out_Station=driver.findElement(By.xpath("//div[@class='OutstationComponent__cardheader___Fulj1'][contains(.,'Outstation')]"));
	    Out_Station.click();
	    
	}

}
