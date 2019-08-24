package genericlib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	
	public  static void fb(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("ankita");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("ankita.t0909@gmail.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("ankita.t0909@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("ankita0909");
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(ele);
		s.selectByIndex(13);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(ele1);
		s1.selectByIndex(9);

		WebElement ele2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("2000");
		
		
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
		
		
		
	}
}
