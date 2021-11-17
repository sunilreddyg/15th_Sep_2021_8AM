package robot_wndow_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_File {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		Thread.sleep(5000);
		
		WebElement Upload_button=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		Upload_button.click();
		Thread.sleep(2000);
		
		
		String path="D:\\HRM_Project1\\MyResume.docx";
		
		//Copy String and save into clipboard
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		//Create object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter Key
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
