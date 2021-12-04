package chromeoptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Add_File_Extensions 
{

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod chrome Extensions using crx file
		 */
	
		//Adding extensions to automation browser
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\Truepath2.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\XY.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\IMC.crx"));
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://selenium.dev");
		
		

	}

}
