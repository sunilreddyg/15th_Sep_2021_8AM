package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberTo_Text_Converter {

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
	
		//Reading Number From Cell [By Default it read in number format]
		double db_value=row.getCell(5).getNumericCellValue();
		System.out.println("Mobile Number Bfore Convertion --> "+db_value);
		
		//Converting Double value to String Characters
		String MobileNumber=NumberToTextConverter.toText(db_value);
		System.out.println("Mobile Number after converting to text --> "+MobileNumber);
		
		
	}

}
