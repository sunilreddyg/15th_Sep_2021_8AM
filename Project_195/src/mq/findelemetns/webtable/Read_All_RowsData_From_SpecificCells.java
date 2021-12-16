package findelemetns.webtable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_All_RowsData_From_SpecificCells {

	public static void main(String[] args) 
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		//Identify table
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		System.out.println("Table identified");
		
		//Find list of Rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		rows.remove(0);   //Removing header
		
		for (int i = 0; i <rows.size(); i++) 
		{
			
			WebElement SelectedRow=rows.get(i);
			
			//Finding list of cell under row
			List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
			
			String Cname=cells.get(0).getText();
			String MarketPrice=cells.get(1).getText();
			String NetPrice=cells.get(7).getText();
			
			System.out.println(Cname+"\t"+MarketPrice+"\t"+NetPrice);
		}
		


	}

}
