package commonlibrary.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Keywords 
{
	
	static String Ifile_path="TestData\\InputData.xlsx";
	static String Ofile_path="TestData\\OP.xlsx";
	static FileInputStream fi;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFCell Cell;

	/*
	 * Reusable Keyword:-->
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void ConnectTo_Excel_Workbook(String sheetname)
	{
		
		try {
			
			fi=new FileInputStream(Ifile_path);
			System.out.println("----------Excel file is located ---------");
			
			book=new XSSFWorkbook(fi);
			
			sht=book.getSheet(sheetname);
			System.out.println("-----------Workbook Sheet located---------");
			
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		}
	}
	
	
	/*
	 * Reusable Keyword:-->
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static String get_cellData(int rownum, int cellnum)
	{
		String CellData=sht.getRow(rownum).getCell(cellnum).getStringCellValue();
		return CellData;
	}

	
	
	/*
	 * Reusable Keyword:--> Method return row count in interger format [Last row of data exist]
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static int get_rowcount()
	{
		return sht.getLastRowNum();
	}
	
	
	/*
	 * Reusable Keyword:--> Method Write data into Excel in perticular row and perticular cell
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void Write_CellData(int Rownum, int Cellnum, String result)
	{
		sht.getRow(Rownum).createCell(2).setCellValue(result);
	}
	
	
	/*
	 * Reusable Keyword:--> Return Diffrent CellType Data
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void getStringCellData(int row, int cell)
	{
		 Cell=sht.getRow(row).getCell(cell);
		 String Celldata=null;
		 if(Cell.getCellType()==CellType.STRING)
		 {
			 Celldata=Cell.getStringCellValue();
		 }
		 else if(Cell.getCellType()==CellType.NUMERIC)
		 {
			 double dble=Cell.getNumericCellValue();
			 Celldata=NumberToTextConverter.toText(dble);
		 }
		 else if(Cell.getCellType()==CellType.BOOLEAN)
		 {
			 Boolean bln=Cell.getBooleanCellValue();
			 Celldata=bln.toString();
		 }
		 else
		 {
			 System.out.println("Cell Type Not matched");
		 }
	}
	
	
	/*
	 * Reusable Keyword:--> Return CellValue
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static XSSFCell GetCellType(int rnum,int cnum)
	{
		return sht.getRow(rnum).getCell(cnum);
	}
	
	
	/*
	 * Reusable Keyword:--> Close workbook
	 * Author:-->
	 * Created Date:-->
	 * Last Modified Date:-->		
	 */
	public static void Close_workbook()
	{
		try {
			FileOutputStream fo=new FileOutputStream(Ofile_path);
			book.write(fo);
			book.close();
			System.out.println("----------------Workbook is Closed -----");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

	
}
