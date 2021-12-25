package framework.Datadriven.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_PropertyFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\Input.properties");
		System.out.println("file located");
		
		//Create object for property file
		Properties obj=new Properties();
		//load input file into propery file
		obj.load(fi);
		
		
		String application_url=obj.getProperty("url");
		String App_UID=obj.getProperty("username");
		String App_PWD=obj.getProperty("password");
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(application_url);
		
		driver.findElement(By.id("txtUsername")).sendKeys(App_UID);
		driver.findElement(By.id("txtPassword")).sendKeys(App_PWD);
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}

}
