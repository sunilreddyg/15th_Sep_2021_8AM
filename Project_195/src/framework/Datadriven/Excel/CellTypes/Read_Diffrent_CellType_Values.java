package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Diffrent_CellType_Values {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target File location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is located");
		
		//Access Workbook using above file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet Access
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get FirstRow access Using above sheet Reference
		XSSFRow row=sht.getRow(1);
		
		//Reading Characters From cell
		String ProductName=row.getCell(0).getStringCellValue();
		System.out.println("ProductName is String frmt ---> "+ProductName);
		
		//Reading Number From Cell [By Default it read in number format]
		double db_value=row.getCell(1).getNumericCellValue();
		System.out.println("Number if Double Frmt is --> "+db_value);
		
		//AutoBoxing  [Data Wrapping][Converting primitive data type to Class]
		Double dble=new Double(db_value);
		System.out.println("Double value to Integer --> "+dble.intValue());
		System.out.println("Double value to String --> "+dble.toString());
		
		
		
		
	}

}
