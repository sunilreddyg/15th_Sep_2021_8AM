package framework.Datadriven.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Create_Properties_At_Runtime 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Create object for properties
		Properties repository=new Properties();
		repository.setProperty("result1", "Testpass");
		repository.setProperty("result2", "Testpass");
		repository.setProperty("result3", "Testfail");
		repository.setProperty("result4", "Testpass");
		repository.setProperty("result5", "Tesfail");
		
		
		//Create output file
		String File_output_path="src\\framework\\Datadriven\\Properties\\Ouptut.properties";
		FileOutputStream fo=new FileOutputStream(File_output_path);
		repository.store(fo, "Login Test Result");
		
		
		
	}

}
