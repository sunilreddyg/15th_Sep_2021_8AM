package framework.Datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws Exception 
	{
		
		//Target File location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is located");
		
		//Access Workbook using above file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet Access
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//Get First And Last Row Number
		int FRnum=sht.getFirstRowNum();
		int LRnum=sht.getLastRowNum();
		
		System.out.println("Date Started at First row is --> "+FRnum);
		System.out.println("End Row of Data --. "+LRnum);
		
		
		//Iterate for number of rows
		for (int i = 4; i <= LRnum; i++) 
		{
			 String UID=sht.getRow(i).getCell(0).getStringCellValue();
			 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			 
			 System.out.println(UID+"    "+PWD);
		}
		
	}

}
