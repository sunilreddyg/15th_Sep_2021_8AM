package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		//locate file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Using fileinputstream reference get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet Access using above book reference
		XSSFSheet sht=book.getSheet("Tc001");
		
		//Get Required row using above sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get cell using above row reference
		XSSFCell cell=row.getCell(0);
		
		//Read data from Cell
		String Browsername=cell.getStringCellValue();
		System.out.println(Browsername);
		
		
		String URL=row.getCell(1).getStringCellValue();
		String UID=row.getCell(2).getStringCellValue();
		String PWD=row.getCell(3).getStringCellValue();
		
		System.out.println(URL+"\t"+UID+"\t"+PWD);
		
		
	}

}
