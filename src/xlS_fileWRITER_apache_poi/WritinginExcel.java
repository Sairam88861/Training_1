package xlS_fileWRITER_apache_poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritinginExcel {
	
	

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook0= new XSSFWorkbook();
		
		XSSFSheet sheet1= workbook0.createSheet("first sheet");
		
		/*Row row0= sheet1.createRow(0);
		
		Row row1= sheet1.createRow(1);
		
		Cell cell0= row0.createCell(0);
		
		cell0.setCellValue("name");
		
		Cell cell1= row0.createCell(1);
		
		cell1.setCellValue("Class");
		
		// creating file stream
		
		
		Cell cell2= row1.createCell(0);
		
		cell2.setCellValue("mohan");
		
		Cell cell3= row1.createCell(1);
		
		cell3.setCellValue("first");*/
		
		
		
		for(int rows=0; rows<15; rows++){
			
			Row row= sheet1.createRow(rows);
			
			for(int col=0; col<20; col++){
				
				Cell cell= row.createCell(col);	
				
				cell.setCellValue((int)(Math.random()*200));
				
			}
			
			
		}
		
		
		
		File f= new File("A:\\AllfilesbyJAVA\\new.xlsx");
		
		FileOutputStream fo= new FileOutputStream(f);
		
		workbook0.write(fo);
		
		
		fo.close();
		
		workbook0.close();
		
		System.out.println("write in xlsx file done");
		
		
		
		
		
		
	

	}

}
