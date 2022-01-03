package framework.Datadriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws IOException 
	{
		
		//Target Csv File
		FileReader fr=new FileReader("src\\framework\\Datadriven\\CsvFiles\\IP.csv");
		System.out.println("File is located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		String Headers[]=reader.readNext();
		System.out.println(Headers[0]+"      "+Headers[1]);
		
		String Readline[];
		while((Readline=reader.readNext())!=null)
		{
			System.out.println(Readline[0]+"    "+Readline[1]);
		}
		
		
	}

}
