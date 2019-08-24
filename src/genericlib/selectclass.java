package genericlib;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	
	public void byindex(WebElement ele,int index)
	{
		Select s = new Select (ele);
		s.selectByIndex(index);
	}
	public void byvalue(WebElement ele,String value)
	{
		Select s = new Select (ele);
		s.selectByValue(value);
	}
	
	public void byvisibletext(WebElement ele,String value)
	{
		Select s = new Select (ele);
		s.selectByVisibleText(value);
	
	}
	public void dbyvisibletext(WebElement ele,String value)
	{
		Select s = new Select (ele);
		s.deselectByVisibleText(value);
	
	}
	public void dbyindex(WebElement ele,int index)
	{
		Select s = new Select (ele);
		s.deselectByIndex(index);
	}
	public void dbyvalue(WebElement ele,String value)
	{
		Select s = new Select (ele);
		s.deselectByValue(value);
	}
	
	public int getopt(WebElement ele)
	{
		Select s = new Select (ele);
		List<WebElement> allwh = s.getOptions();
		int x = allwh.size();
		return x;
		
	}
	
	public int getallselectdopt(WebElement ele)
	{
		Select s = new Select (ele);
	List<WebElement> allwh = s.getAllSelectedOptions();
	int x = allwh.size();
	return x;
		
	}
	
	public WebElement getfirstselectdopt(WebElement ele)
	{
		Select s = new Select (ele);
	WebElement first = s.getFirstSelectedOption();
	return first;
		
	}
	
	
	
	
	
}
