package scripts;

import java.io.IOException;

import genericlib.eclipse;
import genericlib.generic_test;










import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;






import pom.gmailpom;
import pom.gmailpomcompose;

public class login extends generic_test {

	
	@Test
	public void testlogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	gmailpom gp = new gmailpom(driver);
	Thread.sleep(5000);
//	
	eclipse ec= new eclipse();
	String id = ec.getdata("sheet1", 1, 0);
	gp.usn(id);
	
	Thread.sleep(5000);
	gp.nxt();
	Thread.sleep(5000);
//;
	String p = ec.getdata("sheet1", 1, 1);
	gp.pwd(p);
	gp.nxt();
	Thread.sleep(5000);
	gmailpomcompose gp1 = new gmailpomcompose(driver);
	gp1.clickcompose();
	Thread.sleep(5000);
	gp1.senddata("ankita.0909@gmail.com");
	Thread.sleep(5000);
	gp1.senddat("hi");
	Thread.sleep(5000);
	gp1.sendda("hello");
	Thread.sleep(5000);
	gp1.clicksend();
	Thread.sleep(5000);
	
	gp1.clicklogo();
	Thread.sleep(5000);
	gp1.clicksignout();
	
	
	}


	

	
	}

