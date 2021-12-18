package pageobjects.RunPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.HRM_LoginPage;
import pageobjects.Pages.HRM_MainMenuTabs;
import pageobjects.Pages.UserAdmin;

public class RunPageobjects3 {

	public static void main(String[] args) throws Exception {
		
		
		String path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		login.userlogin("Admin", "admin123");
		Thread.sleep(2000);
		
		HRM_MainMenuTabs menu=new HRM_MainMenuTabs(driver);
		menu.admin.click();
		
		UserAdmin admin=new UserAdmin(driver);
		if(admin.VerifyPageurl())
		{
			admin.Table_FirstRow_Checkbox.click();		}
	    }

}
