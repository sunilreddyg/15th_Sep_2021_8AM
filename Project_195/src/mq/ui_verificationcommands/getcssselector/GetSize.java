package ui_verificationcommands.getcssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//Get Object height and width
		int Obj_Height=RoundTrip.getSize().getHeight();
		int Obj_width=RoundTrip.getSize().getWidth();
		
		
		System.out.println("Object Height is --> "+Obj_Height);
		System.out.println("Object width is --> "+Obj_width);
		
		//Check object is visble at webpage
		if(Obj_Height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
	}

}
