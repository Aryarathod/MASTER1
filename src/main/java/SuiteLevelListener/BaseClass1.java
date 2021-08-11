package SuiteLevelListener;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class BaseClass1 {

	 static WebDriver driver ;
	
	public void browserInitialize()
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\Desktop\\SeliniumTest\\chromedriver.exe");
		
		driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(1100, TimeUnit.SECONDS);
	}
	public  void captureScreenshot(String TCName) throws IOException
	{    
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\91913\\Desktop\\Apache_POI\\Screenshot\\TestCase"+TCName+".png");
		
		FileHandler.copy(src, dest);
		Reporter.log("Screenshot Taken ", true);
		
	}

}