package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window2 {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    
	    //Click On Hyperlink to pen Page at New window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(5000);
	    
	    //Get All Window ID's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    System.out.println(AllWindowIDS.size());
	    
	    for (String Eachwindow : AllWindowIDS) 
	    {
			driver.switchTo().window(Eachwindow);
		}
	    
	    System.out.println("Current Window Title is --->"+driver.getTitle());
	    
	    //Close Sub Window
	    driver.close();
	    
	    
	    //Switch Controls to mainwidow
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Main Window Title is ---> "+driver.getTitle());
	    
	}

}
