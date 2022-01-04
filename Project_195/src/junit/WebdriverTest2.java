package framework.junit;

import java.io.File;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebdriverTest2 
{
	
	static WebDriver driver;
	
	//This syntax allow to access current Junit Test Methods
	public @Rule TestName test=new TestName();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(4000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\"+test.getMethodName()+".png"));
	}

	@Test
	public void verify_signup_link() 
	{
		driver.findElement(By.xpath("//a[@href='/reg/'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Facebook signup title is verified");
	}
	
	
	@Test
	public void verify_login_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/'][contains(.,'Log In')]")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Facebook Login  title is verified");
	}
	
	
	@Test
	public void verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger page title is veriifed  title is verified");
	}
	
	

}
