package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class ActitimeLogin extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 1, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 1, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 1, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			if(getCurrentTitleOfApplication("actiTIME - Enter Time-Track").equals("actiTIME -  Enter Time-Track")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 1, 3,"Passed");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppTest.xlsx", "Sheet1", 1, 3,"Failed");
			}
			Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME -  Enter Time-Track");
			
	}
	@AfterTest
	public void cleanUp1() {
		
		cleanUp();
	}
}
