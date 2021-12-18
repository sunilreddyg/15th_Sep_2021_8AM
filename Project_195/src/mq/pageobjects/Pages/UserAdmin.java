package pageobjects.Pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserAdmin
{
	
	WebDriver driver;

	public UserAdmin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;   //Locally passed drive assigned to global variable
	}
	
	public boolean VerifyPageurl()
	{
		boolean flag=driver.getCurrentUrl().contains(url);
		return flag;
	}


	String url="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
	
	@FindBy(xpath = "//input[contains(@id,'userName')]")
	public WebElement  username;
	
	@FindBy(xpath = "//select[contains(@id,'userType')]")
	public WebElement  userole;
	
	@FindBy(xpath = "//input[contains(@id,'empName')]")
	public WebElement  Employeename;
	
	@FindBy(xpath = "//select[contains(@id,'status')]")
	public WebElement  status;
	
	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement  search;
	
	@FindBy(xpath = "//input[@id='resetBtn']")
	public WebElement  reset;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement  add;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement  Table_FirstRow_Checkbox;

	@FindBy(xpath = "//a[@class='toggle tiptip']")
	public WebElement PageHeader;

}