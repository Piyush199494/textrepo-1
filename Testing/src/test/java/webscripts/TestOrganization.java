package webscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;
import webpages.VtigerOrganizationPage;

public class TestOrganization extends SeleniumUtility {
	VtigerLoginPage getvtigerLoginPage=null;
	VtigerHomePage getvtigerHomePage=null;
	VtigerOrganizationPage getvtigerOrganizationPage=null;

@BeforeTest	
	public void Prerequisite() {
	WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getvtigerLoginPage=new VtigerLoginPage(driver);
		getvtigerHomePage=new VtigerHomePage(driver);
		getvtigerOrganizationPage=new VtigerOrganizationPage(driver);
		getvtigerLoginPage.loginInVtiger("admin", "Test@123");
		getvtigerHomePage.navigateToOrganization();
		
		
	}
	@Test
	public void testOrganizationCreation() {
		getvtigerOrganizationPage.CreateNewOrgnization("Bhagyaa3", "66664808", "landowner");
		Assert.assertTrue(getvtigerOrganizationPage.checkorgnizationCreation(), "organization is not created");
	}
	
	@Test(dependsOnMethods = "testOrganizationCreation")
	public void testOrganizationModification() {
		getvtigerOrganizationPage.Modification();
		Assert.assertTrue(getvtigerOrganizationPage.OrganizationModification(), "Website is not added");

	}
	
	@Test(dependsOnMethods = "testOrganizationModification")
	public void testOrganizationDeletion() {
		getvtigerOrganizationPage.deleteCreatedorgnization();
		Assert.assertTrue(getvtigerOrganizationPage.checkorgnizationCreation(), "Organization is not deleted");		
	}
	
	@AfterTest
	public void cleanUp() {
		driver.close();		
	}
	
}
