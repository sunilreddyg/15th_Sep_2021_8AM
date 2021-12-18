package pageobjects.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRM_LoginPage 
{
	
	@FindBy(id="txtUsername") 
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement loginbutton;
	
	@FindBy(xpath = "//a[contains(.,'Forgot your password?')]")
	public WebElement forgotpassword;
	
	
	
	
	public void userlogin(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginbutton.click();
	}
	
	public void click_forgotpassword()
	{
		forgotpassword.click();
	}
	

}
