package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultileData_Using_Conditions 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");

		//Get Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target Sheet
		XSSFSheet sht=book.getSheet("Sheet5");
		
		
		for (int i = 1; i <= sht.getLastRowNum(); i++) 
		{
				String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
				if(Exe_status.equalsIgnoreCase("y"))
				{
					String UID=sht.getRow(i).getCell(0).getStringCellValue();
					String PWD=sht.getRow(i).getCell(1).getStringCellValue();
					
					System.out.println(UID+"   "+PWD);
				}
		}
		
		
		

	}

}
