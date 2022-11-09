package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLeadsPage;
import webpages.VtigerLoginPage;

public class VtigerLeadPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	VtigerLeadsPage getVtigerLeadsPage;
WebDriver driver;
	 @Given("^User is already logged in$")
	    public void user_is_already_logged_in()  {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		 getVtigerLoginPage =new VtigerLoginPage(driver);
		 getVtigerHomePage=new VtigerHomePage(driver);
		 getVtigerLeadsPage=new VtigerLeadsPage(driver);
   }

	    @When("^click on Add Leads button and enter firstname as (.+),last as (.+), number as (.+) and click on save button$")
	    public void click_on_add_leads_button_and_enter_firstname_as_last_as_number_as_and_click_on_save_button(String firstname, String lastname, String phonenumber)  {
	        getVtigerLeadsPage.createNewLead(firstname, lastname, phonenumber);
	    }

	    @When("^click on select all leads checkbox$")
	    public void click_on_select_all_leads_checkbox()  {
	    	getVtigerLeadsPage.selectAllLeadsCheckBox();
	        
	    }

	    @Then("^Verify Lead is created with (.+)$")
	    public void verify_lead_is_created_with(String lastname)  {
	       Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation());
	    }

	    @Then("^Verify that all leads are deleted$")
	    public void verify_that_all_leads_are_deleted()  {
	    	Assert.assertEquals(getVtigerLeadsPage.getLeadsList("class"), "emptyRecordsDiv","Leads are not deleted");	        
	    }

	    @And("^user logged in successfully with valid data$")
	    public void user_logged_in_successfully_with_valid_data()  {
	    	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	        
	    }

	    @When("^click on navigation bar$")
	    public void click_on_navigation_bar()  {
	        clickOnElement(getVtigerHomePage.getFlowNavigator());
	    }

	    @And("^go to marketing and select leads$")
	    public void go_to_marketing_and_select_leads()  {
	        clickOnElement(getVtigerHomePage.getSelectMarketingOption());
	        clickOnElement(getVtigerHomePage.getSelectLeadsOption());
	    }

	    @And("^click on All lead link$")
	    public void click_on_all_lead_link()  {
	    	getVtigerLeadsPage.clickOnHeader();
	        
	    }

	    @And("^click on delete logo$")
	    public void click_on_delete_logo()  {
	    	getVtigerLeadsPage.clickOnDeleteLogo();
	        
	    }

	    @And("^User will get a popup ,select yes$")
	    public void user_will_get_a_popup_select_yes()  {
	        getVtigerLeadsPage.confirmLeadDeletion();
	    }
	    
	    @And("^close the Vtiger browser$")
	    public void close_the_vtiger_browser()  {
	        cleanUp();
	    }
}
