package Kite_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Kite_getText 
{
	@FindBy(xpath = "//button[@class='button-orange wide']")  private WebElement Click_ON_Progile;
	@FindBy(xpath = "//span[@class='user-id']")  private WebElement GetText;
	
	public Kite_getText(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	public void ClickOnProfile()
	{
		Click_ON_Progile.click();
	}
	public void  GetProgileText()
	{
		String ActualUserid = Click_ON_Progile.getText();
		System.out.println(ActualUserid);
	 
	    String ExpecxtedUserid= " DV1510 ";
		System.out.println("\nEXPECTED USER ID IS ="+ExpecxtedUserid);
		System.out.println("------------------------------------------------------------------------------------");
		if(ActualUserid.equals(ExpecxtedUserid))	
		{
			System.out.println("***USER ID AND PASSWORD MATCHING****");
		}
		else {			System.out.println("***USER ID AND PASSWORD  NOT MATCHING***");	
			
		}
		System.out.println("------------------------------------------------------------------------------------");
	 
	}
	
	
}

 
