package framework.Datadriven.CsvFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_All_Values {

	public static void main(String[] args) throws IOException {
		
		
		//Target Csv File
		FileReader fr=new FileReader("src\\framework\\Datadriven\\CsvFiles\\IP.csv");
		System.out.println("File is located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
				
		String Headers[]=reader.readNext();
		System.out.println(Headers[0]+"      "+Headers[1]);
		
		
		for (String[] EachRow : reader.readAll()) 
		{
			System.out.println(EachRow[0]+"     "+EachRow[1]);
		}
		

	}

}
