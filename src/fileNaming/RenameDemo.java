package fileNaming;

import java.io.File;
import java.util.Date;

public class RenameDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		File oldFile = new File("C:/Users/pavan/Documents/Zoom/File3 Fri_Nov_12_14_26_23_IST_2021");
		System.out.println(d);
		
		
		String date = d.toString().replace(":", "_").replace(" ", "_");
		
		File newFile = new File("C:/Users/pavan/Documents/Zoom/File3"+date);
		
		if(oldFile.renameTo(newFile)){
			
			System.out.println("renamed");
		}else{
			
			System.out.println("Not Renamed");
			
		}
	

	}

}
