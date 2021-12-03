package switch_commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Performing_Action_At_ActiveElement {

	public static void main(String[] args) {
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Take Controls to ActiveElement at webpage
	    WebElement element=driver.switchTo().activeElement();
	    element.sendKeys("darshan");
	}

}
