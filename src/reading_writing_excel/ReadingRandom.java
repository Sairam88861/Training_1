package reading_writing_excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingRandom {

	public static void main(String[] args) throws IOException {
		
		File f= new File("A:\\AllfilesbyJAVA\\newfile1.csv");
		
		FileWriter fw= new FileWriter(f, false);
		
		BufferedWriter write= new BufferedWriter(fw);
		
		for(int i=0; i<5;i++){
			
			for(int j=0; j<4; j++){
				
				int number= (int)(Math.random()*100);
				
				write.write(number+" ,");
				
				
					
			}
			write.newLine();
			
		}
	
		write.close();
		
		System.out.println("file created  !!!");
	}

}
