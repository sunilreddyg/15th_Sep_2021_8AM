package findelemetns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart_Group_Products {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.sendKeys("iphone 11");
		SearchBox.submit();
		Thread.sleep(2000);
		
		
		boolean flag=false;
		WebElement Next_btn;
		
		do {
			
			
			
			WebElement RecordsTable=driver.findElement(By.xpath("(//div[contains(@class,'_1YokD2 _3Mn1Gg')])[3]"));
			List<WebElement> products=RecordsTable.findElements(By.className("col-12-12"));
			System.out.println(products.size());
			
			for (int i = 1; i < products.size()-2; i++) 
			{
				
				WebElement Eachproduct=products.get(i);
				//get product name
				String Productname=Eachproduct.findElement(By.className("_4rR01T")).getText();
				//Get price
				String productprice=Eachproduct.findElement(By.xpath("//div[contains(@class,'_30jeq3 _1_WHN1')]")).getText();
		
				System.out.println(Productname+"\t"+productprice.substring(1));
				
				
				
				
			}
			
			try {
				Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
				flag=Next_btn.isDisplayed();
				new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Next_btn));
				if(flag==true)
				{
					Next_btn.click();
					Thread.sleep(3000);
				}
				
			} catch (TimeoutException e) {
				System.out.println(e.getMessage());
				flag=false;
			}
		
		} while (flag==true);
		
	}

}
