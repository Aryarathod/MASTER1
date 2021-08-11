package Kite_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Kite_Login_pg 
{

	@FindBy(xpath = "//input[@id='userid']")  private WebElement User_ID; 
	@FindBy(xpath = "//input[@id='password']")  private WebElement Password;
	@FindBy(xpath = "//button[@class='button-orange wide']")  private WebElement Click_Button;
	
	//create constructor//
	public Kite_Login_pg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUSerId()
	{
		User_ID.sendKeys("DV1510");
	}
	public void EnterPassword()
	{
		Password.sendKeys("Year@123");
	}
	public void ClickOnLoginButton()
	{
		Click_Button.click();
	}



}
