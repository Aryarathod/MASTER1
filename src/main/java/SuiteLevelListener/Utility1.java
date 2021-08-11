package SuiteLevelListener;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.testng.Reporter;

public class Utility1 {

	
	public static String getDatafromExcel(int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	
	{   
		FileInputStream Myfile = new FileInputStream("C:\\Users\\91913\\Desktop\\Apache_POI\\kite_login.xlsx");
		 Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		  

		String value = Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
	}
	
//	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
//	{    
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\Users\\91913\\Desktop\\Apache_POI\\Screenshot\\TestCaseID"+TCID+".png");
//		
//		FileHandler.copy(src, dest);
//		Reporter.log("Screenshot Taken ", true);
//		
//	}


}
