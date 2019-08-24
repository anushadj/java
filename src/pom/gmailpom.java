package pom;

import genericlib.Base_page;
import genericlib.generic_test;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailpom extends Base_page{

	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement ele;
	
	
			@FindBy(xpath="(//span[.='Next'])[1]")
			private WebElement ele1;
			
			
			@FindBy(xpath="//input[@type='password']")
			private WebElement ele2;
			
	public gmailpom(WebDriver driver)
	{
	super(driver);
				
}
	
	public void usn(String value)
	{
		ele.sendKeys(value);	
		
	}
	public void pwd(String value)
	{
		ele2.sendKeys(value);	
		
	}
	
	public void nxt()
	{
		ele1.click();	
		
	}
	
	
}
