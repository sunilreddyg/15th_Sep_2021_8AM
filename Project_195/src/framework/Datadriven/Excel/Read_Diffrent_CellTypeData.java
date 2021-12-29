package framework.Datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Diffrent_CellTypeData {

	public static void main(String[] args) throws Exception {
		
		   //Target file location
			FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file located");

			//Get Workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
			
			//Target Sheet
			XSSFSheet sht=book.getSheet("Sheet6");
		
			for (int i = 1; i <= sht.getLastRowNum(); i++) 
			{
					
				  XSSFCell UsernameCell=sht.getRow(i).getCell(0);
				  
				  String UID=null;
				  if(UsernameCell.getCellType()==CellType.STRING)
				  {
					  UID=UsernameCell.getStringCellValue();
				  }
				  else if(UsernameCell.getCellType()==CellType.NUMERIC)
				  {
					  double dble=UsernameCell.getNumericCellValue();
					 UID=NumberToTextConverter.toText(dble);
				  }
				  
				  System.out.println(UID);
				
			}
			

	}

}
