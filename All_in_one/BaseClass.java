package All_in_one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	
	WebDriver driver=null;
	
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

}