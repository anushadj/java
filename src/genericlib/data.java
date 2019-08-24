package genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.google.common.collect.Table.Cell;

public class data {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./xl/xlsheet.xlsx");
		 
		Workbook wb = WorkbookFactory .create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
      Row r = sh.getRow(4);
      
      org.apache.poi.ss.usermodel.Cell c = r.getCell(3);
      
      System.out.println(c.getStringCellValue());
   
      
      
      
      
      
      
	}

}
