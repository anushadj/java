package pom;

import genericlib.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class gmailpomcompose extends Base_page {
	
	
//	@FindBy(xpath="//input[@id='identifierId']")
//	private WebElement ele;
//	
//	
//			@FindBy(xpath="(//span[.='Next'])[1]")
//			private WebElement ele1;
//			@FindBy(xpath="//input[@type='password']")
//			private WebElement ele2;
			
	
	
//	public void usn(String value)
//	{
//		ele.sendKeys(value);	
//		
//	}
//	public void pwd(String value)
//	{
//		ele2.sendKeys(value);	
//		
//	}
//	
//	public void nxt()
//	{
//		ele1.click();	
//		
//	}
	
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement e1;
	
	

	@FindBy(xpath="//textarea[@aria-autocomplete='list' and @name='to' and @aria-label='To']")
	private WebElement e2;
	
	

	@FindBy(xpath="//input[@name='subjectbox' and @aria-label='Subject']")
	private WebElement e3;
	
	
	@FindBy(xpath="//div[@role='textbox'and @aria-multiline='true']")
	private WebElement e4;
	
	@FindBy(xpath="(//div[.='Send'])[1]")
	private WebElement e5;
	
	
	public gmailpomcompose (WebDriver driver)
	{
		super(driver);
	}
	
	public void clickcompose()
	{
		e1.click();
	}

	public void senddata(String Value)
	{
		e2.sendKeys(Value);;
	}
	public void senddat(String Value)
	{
		e3.sendKeys(Value);
	}
	public void sendda(String Value)
	{
		e4.sendKeys(Value);
	}
	public void clicksend()
	{
		e5.click();
	}
	@FindBy(xpath="//span[@class='gb_Ba gbii']")
	private WebElement e6;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement e7;
	
	public void clicklogo()
	{
		e6.click();
	}
	public void clicksignout()
	{
		e7.click();
	}
}
