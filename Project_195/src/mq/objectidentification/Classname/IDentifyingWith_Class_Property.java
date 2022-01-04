package objectidentification.Classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDentifyingWith_Class_Property {

	public static void main(String[] args) {
		
		String driverPath="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		
		
		WebElement SinginButton=driver.findElement(By.xpath("(//a[contains(@class,'internal sign-in-link')])[2]"));
		SinginButton.click();
		
		
		WebElement Email=driver.findElement(By.className("form-control"));
		Email.sendKeys("sunilreddy.gajjala@gmail.com");
		
		
		WebElement EmailNext_Btn=driver.findElement(By.className("button_primary"));
		EmailNext_Btn.click();
		
	}

}
