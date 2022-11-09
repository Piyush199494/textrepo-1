package stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class ActiTimelogin extends SeleniumUtility {
	 @Given("^User is on actitime login page$")
	    public void user_is_on_actitime_login_page()  {
		 setUp("chrome", "https://demo.actitime.com/");
	    
	    }

	    @When("^User Enters username as (.+) in the username field$")
	    public void user_enters_username_as_in_the_username_field(String username)  {
	    	typeInput(driver.findElement(By.id("username")), username);
	    
	    }

	    @Then("^User should get page title as (.+)$")
	    public void user_should_get_page_title_as(String title)  {
	    getCurrentTitleOfApplication();
	    System.out.println(getCurrentTitleOfApplication());
	    }

	    @And("^user enters password as (.+) in the password field$")
	    public void user_enters_password_as_in_the_password_field(String password)  {
	    typeInput(driver.findElement(By.name("pwd")), password);
	    }

	    @And("^user clicks on login button$")
	    public void user_clicks_on_login_button()  {
	    	clickOnElement(driver.findElement(By.cssSelector("td>a.initial")));    
	    }
	    
	    @And("^close the actiTime browser$")
	    public void close_the_actitime_browser()  {
	       cleanUp();
}


}
