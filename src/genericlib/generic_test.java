package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic_test implements Auto_Constant{
	
	public WebDriver driver;
	
	static
	{
		
		System.setProperty(Gecko_key, Gecko_value);
		}
  
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		 String value = property_file.getdata(Properties_path, "url");
		 String iw = property_file.getdata(Properties_path, "iw");
		 long iw1 = Long.parseLong(iw);
		driver.manage().timeouts().implicitlyWait(iw1, TimeUnit.SECONDS);
		driver.get(value);
	}
	
	@AfterMethod
	public void close_app(ITestResult res) throws IOException
	{
		int v = res.getStatus();
		if(v==2)
		{
			tks.screenshot(driver);
		}
		
		driver.quit();
	}
	
	
}
