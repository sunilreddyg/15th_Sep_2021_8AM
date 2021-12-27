package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_DataCell_Value_From_String 
{

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
		
		//Read date from Cell
		Date date1=row.getCell(4).getDateCellValue();
		//Create Simple Date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date1));
		
	
		LocalDateTime date2=row.getCell(4).getLocalDateTimeCellValue();
		System.out.println(date2);
		
	}

}
