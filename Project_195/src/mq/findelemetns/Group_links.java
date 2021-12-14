package findelemetns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		WebElement Footer_Area=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		System.out.println("Size of footer links ---> "+Footer_links.size());
		
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			  //Get Each link
			WebElement EachLink=Footer_links.get(i);
			String linkname=EachLink.getText();
			String linkhref=EachLink.getAttribute("href");
			
			driver.navigate().to(linkhref);
			Thread.sleep(1000);
			System.out.println(linkname+"   "+driver.getTitle());
			driver.navigate().back();
			Thread.sleep(1000);
			//Restoring to avoid stale element reference exception
			Footer_Area=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
		}
		
		
		
		
		
		
		

	}

}
