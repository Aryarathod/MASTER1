package SuiteLevelListener;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNG_Study2.KiteHomePage3;
import TestNG_Study2.KiteLoginPapge1;
import TestNG_Study2.KitePinPage2;

public class TestLoginLogout1 extends BaseClass1  {
	
	KiteLoginPapge1 page1;
	KitePinPage2 page2;
	KiteHomePage3 page3;
	
	@BeforeClass
	public void LaunchBrowser()
	{  
		Reporter.log("***** This program created by APR ******", true);
	    Reporter.log("Launching Browser", true);
		browserInitialize();
		page1= new KiteLoginPapge1(driver);
		page2= new KitePinPage2(driver);
		page3= new KiteHomePage3(driver);
	}
	@BeforeMethod
	public void LoginApplication() throws EncryptedDocumentException, IOException
	{
		Reporter.log("Application Logged in", true);
		
				page1.SendUserId(Utility1.getDatafromExcel(0, 0));
				page1.SendPassword(Utility1.getDatafromExcel(0, 1));
				page1.ClickOnLoginButton();
			
			
			   page2.EnterPin(Utility1.getDatafromExcel(0, 2));
			   page2.ClickOnContinue();
     
		
	}
	
  @Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException, Exception 
  {
	
	 int TCID= 143;
	 Reporter.log("Running: "+TCID, true);
	 Thread.sleep(1000);
	 String ActualUserID = page3.UserIdValidation(); 
	 String ExpectedUserID = Utility1.getDatafromExcel(0, 3);
	 
	 Assert.assertEquals(ActualUserID, ExpectedUserID,"User ID not matching TC failed");
	 
	 Reporter.log("User ID matching TC Passed ", true);
	 
// Utility1.captureScreenshot(driver, TCID);
	 
  }
  
  @AfterMethod
  public void LogOutFormApplication() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Reporter.log("Loging out ", true);
	  page3.clickOnUserid();
	  page3.ClickOnLogout();
  }
  
  @AfterClass
  public void CloseBroswer() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Reporter.log("Closing Browser ", true);
	  driver.close();
	  
  }

}
