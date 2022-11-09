package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Vtiger extends SeleniumUtility {
	@Parameters({ "browser", "username", "password" })
	@BeforeClass
	public void LoginOfVtiger(String browser, String username, String password) throws InterruptedException {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("Test@123", Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='appnavigator']")).click();
		driver.findElement(By
				.xpath("//div[@class='app-list row']//div[2]//div//div//span[@class='app-name textOverflowEllipsis']"))
				.click();

	}

	@Test(priority = 1)
	public void TestCase1() {
		driver.findElement(By.xpath("//a[@title='Campaigns']")).click();
		driver.findElement(By.xpath("//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")).click();
		driver.findElement(By.xpath("//input[@class='inputElement nameField']")).sendKeys("DefExpo");
		driver.findElement(By.xpath("//input[@class='dateField form-control ']")).sendKeys("1-11-2022");
		driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
		String Actual = driver.getTitle();
		System.out.println(driver.getTitle());
		String expected = "Campaigns - DefExpo";
		Assert.assertTrue(Actual.equals(expected), "Campaign is added");
	}

	@Test(priority = 2)
	public void TestCase2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Campaigns_detailView_basicAction_LBL_EDIT']")).click();
		driver.findElement(By.xpath("//*//tr[2]//td[2]/div[@id='s2id_autogen3']")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']//ul/li[2]")).click();
		driver.findElement(By.xpath("//*//tr[2]//td[4]//div[@id='s2id_autogen5']")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success saveButton']")).click();
		driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")).click();
		WebElement conference = driver.findElement(By.xpath("//span[@class='picklist-color picklist-128-Conference']"));
		Assert.assertTrue(conference.isDisplayed(), "Modification successfull");
	}

	@Test(priority = 3)
	public void TestCase3() {

		WebElement element1 = driver.findElement(By.xpath("//input[@class='listViewEntriesCheckBox']"));
		waitForElementToBeClickable(element1);
		WebElement delete = driver.findElement(By.xpath("//button//i[@class='fa fa-trash']"));
		waitForElementToBeClickable(delete);
		WebElement element = driver.findElement(By.xpath("//a[text()='DefExpo']"));
		Assert.assertTrue(element.isDisplayed(), "Campaign is deleted");
	}

	@AfterTest
	public void cleanup() {
		driver.close();

	}

}
