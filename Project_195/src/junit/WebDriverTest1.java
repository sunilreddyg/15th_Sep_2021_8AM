package framework.junit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest1 
{
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void forgotten_page() 
	{
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//a[contains(.,'Forgotten password?')]")).click();
		Assert.assertEquals("Forgotten Password | Can't Log In | Facebook", driver.getTitle());
		System.out.println("Forgotten Password page title is verified");
	}
	
	
	
	@Test
	public void Create_newPage()
	{
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//a[contains(.,'Create a Page')]")).click();
		Assert.assertEquals("Facebook", driver.getTitle());
		System.out.println("Create page is displayed");
	}
	

}
