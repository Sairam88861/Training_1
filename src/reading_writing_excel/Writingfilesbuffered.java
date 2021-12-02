package reading_writing_excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writingfilesbuffered {
	
	

	public static void main(String[] args) throws IOException {
		
		File f= new File("A:\\AllfilesbyJAVA\\newfile.txt");
		
		FileWriter fw= new FileWriter(f);
		
		BufferedWriter writer= new BufferedWriter(fw);

		String Name= "mohan";
		
		String Class= "new";
		
		int rollno= 25;
		
		System.out.println("file created!!!");
		
		writer.write(Name);
		
		writer.newLine();
		
		writer.write(rollno);
		
		writer.newLine();
		
        writer.write(Class);
		
		System.out.println("file created");
		
		
		//FileReader fr= new FileReader(f);
		
		//BufferedReader br= new BufferedReader(fr);
		
	//	br.read();
		
		
		
		writer.close();
		
		
		
		
   }

}
