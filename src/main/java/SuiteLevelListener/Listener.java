package SuiteLevelListener;

import java.io.IOException;

//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener  extends BaseClass1 implements ITestListener 
{   

	BaseClass1 b= new BaseClass1 ();

   
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed plz try again faild name is " + result.getName());
		String TCName = result.getName();
		try {
			b.captureScreenshot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
	}

	
}
