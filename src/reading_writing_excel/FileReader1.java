package reading_writing_excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("A:\\AllfilesbyJAVA\\newfile1.csv");
		
		FileReader fr= new FileReader(f);
		
		BufferedReader bf= new BufferedReader(fr);
		
		/*System.out.println(bf.readLine());
		
		System.out.println(bf.readLine());
		
		System.out.println(bf.readLine());
		
		System.out.println(bf.readLine());*/
		
		String lines= null;
		while((lines=bf.readLine())!=null){
			
			System.out.println(lines);
		}

		bf.close();
	
	}

}
