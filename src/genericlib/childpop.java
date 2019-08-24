package genericlib;

import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childpop
{

	public void  windwpop(WebDriver driver , WebElement ele)
	{
		Set<String> allwh = driver.getWindowHandles();
		
		
		for(String i:allwh)
		{
			driver.switchTo().window(i);
			System.out.println(i);
		}
		
				
	}
	

	public void  closepidwindwpop(WebDriver driver , WebElement ele)
	{
		Set<String> allwh = driver.getWindowHandles();
		 String p_id = driver.getWindowHandle();
		 
		
		
		for(String i:allwh)
		{
			
			driver.switchTo().window(i);
			
			
			if(allwh.equals(p_id) )
			{
		    driver.close();
			}
			
		}
	}
		public void  closechiddwindwpop(WebDriver driver , WebElement ele)
		{
			Set<String> allwh = driver.getWindowHandles();
			 String p_id = driver.getWindowHandle();
			 
			allwh.remove(p_id);
			
			for(String i:allwh)
			{
				
				driver.switchTo().window(i);
				 driver.close();
				
				
			}
		
		
		
	}




}
