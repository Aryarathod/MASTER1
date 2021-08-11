package Kite_Test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener
{
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Take Screenshot",true);
		
	}

	public void onTestSuccess(ITestResult result) {
			Reporter.log("Test Passed Successful",true);
		}
		
	public void onTestSkipped(ITestResult result) {
			Reporter.log("This test is skipped",true);
		}

	

}
