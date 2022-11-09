package extent;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;


public class Extent2 extends SeleniumUtility{
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void startReport(){
		report = new ExtentReports ("./ExtentReport/ExtentReport.html", true);
		//extent.addSystemInfo("Environment","Environment Name")
		report
                .addSystemInfo("Host Name", "Roshan")
                .addSystemInfo("Environment", "QA")
                .addSystemInfo("User Name", "Roshan bhowate");
                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
                //report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	@Test
	public void testCase1(){
		//extent.startTest("TestCaseName", "Description")
		//TestCaseName � Name of the test
		//Description � Description of the test
		//Starting test
		test = report.startTest("TestCase1");
		Assert.assertTrue(true);
		//To generate the log when the test case is passed
		test.log(LogStatus.PASS, "TestCase1 is pased");
	}
	@Test
	public void testCase2(){
		test = report.startTest("TestCase2");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "TestCase2 is failed");
	}
	
	@Test
	public void skipTest(){
		test = report.startTest("TestCase3");
		throw new SkipException("Skipping - This is not ready for testing ");
	}
	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			test.log(LogStatus.FAIL, "Test Case Failed due to "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(LogStatus.SKIP, "Test Case Skipped due to "+result.getName());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
		report.endTest(test);
	}
	@AfterTest
	public void endReport(){
		// writing everything to document
		//flush() - to write or update test information to your report. 
                report.flush();
                //Call close() at the very end of your session to clear all resources. 
                //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
                //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
                //Once this method is called, calling any Extent method will throw an error.
                //close() - To close all the operation
                report.close();
    }
}

