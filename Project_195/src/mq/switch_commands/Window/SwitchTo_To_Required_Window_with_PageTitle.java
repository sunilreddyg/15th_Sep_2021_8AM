package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo_To_Required_Window_with_PageTitle 
{

	public static void main(String[] args) throws Exception
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //Hover on location to display sub categories
	    WebElement MenuJobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
	    new Actions(driver).moveToElement(MenuJobs).perform();
	    Thread.sleep(1000);
	    
	    //click register to open new window
	    WebElement RegisterNow_JobsMenu=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
	    RegisterNow_JobsMenu.click();
	    Thread.sleep(5000);
	    
	   //Get All Window ID's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    System.out.println(AllWindowIDS.size());
	    
	    //Iterate for all windows
	    for (String EachWindow : AllWindowIDS) 
	    {
	    	  //Switch to every window and get title of window
			   String WindowTitle=driver.switchTo().window(EachWindow).getTitle();
			   if(WindowTitle.contains("Register on Naukri.com"))
			   {
				   break; //It Break Itearation and keep windows control where it browser title mactches
			   }
		}
	    
	    
	    System.out.println("Current Focusexd window title is--> "+driver.getTitle());
	    
	    
	    
	    
	    
	    

	}

}
