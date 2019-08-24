package genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;


public class eclipse implements Auto_Constant {
	public String getdata(String sheet,int row ,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException {
	String v= " ";
		
		try
	{
		FileInputStream fis = new FileInputStream (Excel_path);
		 
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 Cell c =  wb.getSheet(sheet).getRow(row).getCell(cell);
		 
		 v = c.toString();
		 
	}
	
	catch(Exception e){
		Reporter.log(" path", true);
	}
	return v ;
	 
}

}
