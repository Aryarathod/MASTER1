package Kite_Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;



@Listeners(Listerner_Package.Listener.class)
public class listener_study_testClass {

		  @Test
		  public void TC1() 
		  
		  {
			  Reporter.log("TC1 Running",true);
		  }
		  @Test
		  public void TC2() 
		  
		  {
			  Reporter.log("TC2 Running",true);
		  }
		  @Test
		  public void TC3() 
		  
		  {
			  AssertJUnit.fail();
			  Reporter.log("TC3 Running",true);
		  }
		  @Test(dependsOnMethods = "TC3")
		  public void TC4() 
		  
		  {
			  Reporter.log("TC4 Running",true);
		  }


}
