package reading_writing_excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class XlfileReadandWrite {
	
	/*
	 * read xl files
	 * 1.first create File empty file and keep some data in it
	 * 2.create object for file with file name (properties prop= new properties();)
	 * 
	 * 
	 * 
	 */
	
	

	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		
		//declaring input stream of the file path
		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\src\\object.properties");
		
		prop.load(fi);
		
		System.out.println(prop.getProperty("Name"));
		
		System.out.println(prop.getProperty("job"));
		
		System.out.println(System.getProperty("user.dir"));
		
		

	}

}
