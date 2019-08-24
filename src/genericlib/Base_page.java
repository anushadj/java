package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public abstract class Base_page {

	private static final String Properties_path = null;
	public WebDriver driver;
	
	
	
	
	public  Base_page(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 public void verifytitle(String Title) throws FileNotFoundException, IOException
	 {
		  String v = property_file.getdata(Properties_path, "iw");
		 long v1 = Long.parseLong(v);
		 WebDriverWait wait = new WebDriverWait(driver,v1);
		 try{
				wait.until(ExpectedConditions.titleContains(Title));
				Reporter.log("title is matching", true);
			}
		 catch(Exception e){
			 
			 Reporter.log("title isnot  matching", true);
			 Assert.fail();
		 }
		 
	 }
	public void verifyelement(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("element is matching", true);
		}
		catch(Exception e){
			 
			 Reporter.log("element isnot  matching", true);
			 Assert.fail();
		 }
		
		
	}
	
	 
	 
}
