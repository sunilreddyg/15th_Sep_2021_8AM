package cookies_Testing;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_Cookies {

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		
		driver.manage().addCookie(new Cookie("SID", "102145785"));
		
		driver.manage().deleteCookieNamed("SID");
		
		Set<Cookie> allcookies=driver.manage().getCookies();
		for (Cookie EachCookie : allcookies) 
		{
			System.out.println(EachCookie.getName()+"     "+EachCookie.getValue());
			System.out.println(EachCookie.getExpiry());
			
		}
		
		

	}

}
