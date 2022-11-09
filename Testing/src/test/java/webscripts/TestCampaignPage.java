package webscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
import webpages.VtigerCampaignpage;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class TestCampaignPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerCampaignpage getVtigerCampaignpage=null;
	
	@BeforeTest
	public void Prerequisite() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerCampaignpage=new VtigerCampaignpage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToCampaignPage();
				
	}
	@Test
 public void TestcreateCampaign() {
	 getVtigerCampaignpage.CreateCampaign("DefExpo", "1-11-2022");
	 Assert.assertTrue(getVtigerCampaignpage.CheckCampaignCreation(), "Campaign not created");
}
	@Test(dependsOnMethods = "TestcreateCampaign")
	public void CampaignMod() {
		getVtigerCampaignpage.EditCampaign();
		Assert.assertTrue(getVtigerCampaignpage.CampaignModification(), "Not modified");		
	}
	@Test(dependsOnMethods = "CampaignMod")
	public void Delete() {
		getVtigerCampaignpage.DeleteCampaign();
		Assert.assertTrue(getVtigerCampaignpage.CheckCampaignCreation(), "created campaign is not deleted");		
	}
	
	 @AfterTest
	public void tearDown() {
		cleanUp();
		
	}
	
}
