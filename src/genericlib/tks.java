package genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class tks {

	public  static void screenshot(WebDriver driver) throws IOException
	{
		String photos = "./Photos/";
		
		Date d = new Date();
		String d1= d.toString();
		String D = d1.replace(":", "/");
		 TakesScreenshot ts = (TakesScreenshot)driver;
		   File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest= new File (photos+D+".jpej");
		FileUtils.copyFile(src, dest);
	}
	
	 
	
}
