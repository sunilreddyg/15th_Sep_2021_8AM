package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Cells 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");

		//Get Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target Sheet
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Target Row
		XSSFRow row=sht.getRow(1);
		
		//Get FirstCellNumber and Lastcell Number 
		int Fcnum=row.getFirstCellNum();
		int Lcnum=row.getLastCellNum();
		
		System.out.println("Data started at cell number is --> "+Fcnum);
		System.out.println("End Date Cell Number is --> "+Lcnum);
		
		
		for (int i = Fcnum; i < Lcnum; i++) 
		{
			  String CellData=row.getCell(i).getStringCellValue();
			  if(i==5)
			  {
				  System.out.println(CellData);
			  }
		}
		
		
		
		
		
		
		
		
		
	}

}
