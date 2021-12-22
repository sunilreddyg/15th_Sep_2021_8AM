package commonlibrary;

import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.HRM_LoginPage;
import pageobjects.Pages.HRM_MainMenuTabs;
import pageobjects.Pages.UserAdmin;

public class Testcases extends CommonReusableActions
{
	String url="https://opensource-demo.orangehrmlive.com/";
	
	
	public void setupbrowser()
	{
			LaunchBrowser("chrome");
			setwindow_size(800, 600);
			load_webpage(url);
			set_implicitwait(20);
			set_explicitwait_time(30);
	}
	
	public void userlogin()
	{
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		Type_text(login.username, "Admin");
		Type_text(login.password, "admin123");
		click_element(login.loginbutton);
		wait(2000);
	}
	
	public void CreateAdminRole()
	{
		HRM_MainMenuTabs tabs=new HRM_MainMenuTabs(driver);
		click_element(tabs.admin);
		
		UserAdmin admin=new UserAdmin(driver);
		click_element(admin.add);
		select_dropdown(admin.userole, "index", "0");
	}
	
	
	public static void main(String args[])
	{
		Testcases obj=new Testcases();
		obj.setupbrowser();
		obj.userlogin();
		obj.CreateAdminRole();
	}

}
