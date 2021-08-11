package Kite_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_EnterPIN 
{

	@FindBy(xpath = "//input[@id='pin']")  private WebElement EnterPIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")  private WebElement Continue_Button;
	
	
	
	public Kite_EnterPIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void Enter_Valid_PIN()
	{
		EnterPIN.sendKeys("959594");
	}
	public void ClickOnContinueButton()
	{
		Continue_Button.click();
	}
}


