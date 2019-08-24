package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();;
	}
	
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();	
		
	
	}
	
	public void dragdrop(WebDriver driver,WebElement src, WebElement tgt)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tgt).perform();	
		
	
	}

	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();	
		
	
	}
	
	
	
	
	
	
}
