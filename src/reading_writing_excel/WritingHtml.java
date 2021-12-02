package reading_writing_excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingHtml {

	public static void main(String[] args) throws IOException {
		
		File f= new File("A:\\AllfilesbyJAVA\\file2.html");
		

	    FileWriter fw= new FileWriter(f);

		BufferedWriter writer= new BufferedWriter(fw);
		
		writer.write("<html><body><title>new HTML title</title><h1>Learn java writing</h1></body></html>");
		
		writer.close();
		
		System.out.println("File created !!!");
		
		

	}

}
