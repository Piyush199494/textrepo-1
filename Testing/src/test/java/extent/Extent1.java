package extent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;


public class Extent1 extends SeleniumUtility{
	static ExtentReports reports;
	static ExtentTest test;
  @BeforeTest
  public static void starttest() {
	  reports=new ExtentReports(".\\ExtentReport\\ExtentReportResults.html");
	  test=reports.startTest("GooglePageReport");
  }
  @Test
  public void Testcase1() throws IOException {
	  WebDriver driver=setUp("chrome", "https://www.google.com");
	  if(getCurrentTitleOfApplication().equals("Google")) {
		  test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)),"Navigated to the specified URL successfully and page tile is also validated");
	  }else {
		  test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(driver)),"Google page validation got failed");
	 Assert.assertTrue(getCurrentTitleOfApplication().equals("Google"));
	 }	
	  cleanUp();
}
  @Test
  public void TestCase2()throws IOException {
	  WebDriver driver=setUp("chrome", "https://www.google.com");
		if (getCurrentTitleOfApplication().equals("Google1")) {
			test.log(LogStatus.PASS,test.addScreenCapture(screenShot(driver)), "Navigated to the specified URL successfully and page tile is also validated");
			//System.out.println("Navigated to the specified URL successfully and page tile is also validated");
		} else {
			test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Google page validation got failed");
			//System.out.println("Google page validation got failed");
			Assert.assertTrue(getCurrentTitleOfApplication().equals("Google1"));
		}
		cleanUp();
}
  @AfterClass
  public static void endTest() {
		reports.endTest(test);
		reports.flush();
	} 
  public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
  
  
  
  
}
