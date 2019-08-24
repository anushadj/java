package genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSE {
	
	public void scroll (WebDriver driver, WebElement ele)
	{
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x = loc.getX();
		System.out.println(x);
		
		int y = loc.getY();
		System.out.println(y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}
