package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Boolean_Cell_value {

	public static void main(String[] args) throws IOException {
		
		//Target File location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File is located");
		
		//Access Workbook using above file reference
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet Access
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get FirstRow access Using above sheet Reference
		XSSFRow row=sht.getRow(1);
		
		
		//Reading boolean value from String
		Boolean flag=row.getCell(3).getBooleanCellValue();
		System.out.println(flag);
		System.out.println(flag.toString());

		
			
		
	}

}
