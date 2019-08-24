package genericlib;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webelementclass {

	

	public Point getlocation(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
		
		int y = loc.getY();
		System.out.println(y);
		return loc;
		
		
	
	}
	
	public void senddata(WebElement ele, String value)
	{
		ele.sendKeys(value);
		
	
	}
	
	public void tooltip(WebElement ele, String value)
	{
		ele.getAttribute(value);
		
	
	}
	public void css(WebElement ele, String value)
	{
		ele.getCssValue(value);
		
	
	}
	
	public void size(WebElement ele)
	{
		ele.getSize();
		
	
	}
	
	
	
}
