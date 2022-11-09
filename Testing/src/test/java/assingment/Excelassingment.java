package assingment;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;


public class Excelassingment extends SeleniumUtility {
	String AppUrl;
	String username;
	String password;
	@BeforeTest
	public void getData() {
		AppUrl=ExcelUtility.getCellValue("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 0);
		username=ExcelUtility.getCellValue("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 1);
		password=ExcelUtility.getCellValue("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 2);
	
	}
	@Test
	public void Vtiger()throws IOException {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.className("button")).click();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleIs("Dashboard"));
		if(getCurrentTitleOfApplication("Dashboard").equals("Dashboard")) {
			ExcelUtility.updateExcelContent("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 5, "Passed");
		}else {
			ExcelUtility.updateExcelContent("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 5, "Failed");
		}
		String actualtitle=driver.getTitle();
		if(getCurrentTitleOfApplication("Dashboard").equals("Dashboard")) {
			ExcelUtility.updateExcelContent("E:\\clonedrepo\\demo\\Maven23June\\src\\test\\resources\\AppTest.xlsx", "TC", 1, 4, "Dashboard");
		}
		Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard");
		}
		@AfterTest
		public void cleanUp1() {
			cleanUp();
			
		}
		
	}

  

 

