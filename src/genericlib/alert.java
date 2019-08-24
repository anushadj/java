package genericlib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert {

	public  void alertaccept(WebDriver driver,WebElement ele)
	{
		Alert a= driver.switchTo().alert();
		a.accept();
		


	}
	public  void alertdismiss(WebDriver driver,WebElement ele)
	{
		Alert a= driver.switchTo().alert();
		a.dismiss();
		


	}
	

public  void alertgttxt(WebDriver driver,WebElement ele)
{
	Alert a= driver.switchTo().alert();
	System.out.println(a.getText());
	
	


}
public  void alersndkys(WebDriver driver,WebElement ele,String value )
{
	Alert a= driver.switchTo().alert();
     a.sendKeys(value);
	
	


}

}
