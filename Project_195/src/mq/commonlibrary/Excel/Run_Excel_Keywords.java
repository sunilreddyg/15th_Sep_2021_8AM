package commonlibrary.Excel;

public class Run_Excel_Keywords {

	public static void main(String[] args) 
	{
		
		Excel_Keywords.ConnectTo_Excel_Workbook("Sheet3");
		for (int i = 4; i < Excel_Keywords.get_rowcount(); i++) 
		{
			 String UID=Excel_Keywords.get_cellData(i, 0);
			 System.out.println(UID);
			 
			
		}

	}

}
