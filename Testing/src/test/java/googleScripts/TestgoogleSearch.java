package googleScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googlepages.GoogleSearch;
import utilities.SeleniumUtility;


public class TestgoogleSearch extends SeleniumUtility {
	@BeforeTest
	public void testsearch() {
		WebDriver driver = setUp("chrome", "https://www.google.com");
		GoogleSearch search = new GoogleSearch(driver);
		search.SearchText("Selenium");
		
		Assert.assertTrue(getPageTitle().contains("Selenium"), "Google search was not succesfull");
	}

	@AfterTest
	public void cleanup() {
		driver.close();
	}

}
