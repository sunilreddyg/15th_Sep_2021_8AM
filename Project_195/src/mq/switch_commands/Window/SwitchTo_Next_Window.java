package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
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
	    
	    //Convert Set<String> values into iterators
	    Iterator<String> itr=AllWindowIDS.iterator();
	    
	    //At Iterator Next keyword allow to read each iterator value
	    String W1=itr.next();
	    String W2=itr.next();
	    
	    System.out.println("before Switch Title is -->"+driver.getTitle());
	    driver.switchTo().window(W2);
	    System.out.println("Aftet Switch Title is ---"+driver.getTitle());
	    
	    //Close Sub Window
	    driver.close();
	    
	    
	    //Switch To Main Window
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Main Window ID is --->"+driver.getTitle());
	    

	}

}
