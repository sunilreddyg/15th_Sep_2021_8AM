package findelemetns.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		
		//Finding list of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		rows.remove(0);   //Removing header tag
		
		//Get Sigle element from list using index number
		WebElement SelectedRow=rows.get(2);
		
		//Finding list of cell under row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		String Cname=cells.get(0).getText();
		String MarketPrice=cells.get(1).getText();
		String NetPrice=cells.get(7).getText();
		
		System.out.println(Cname+"\t"+MarketPrice+"\t"+NetPrice);
		
		
	}

}
