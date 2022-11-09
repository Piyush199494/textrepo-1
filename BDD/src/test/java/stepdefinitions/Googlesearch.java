package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class Googlesearch extends SeleniumUtility{
	 @Given("^User has already on google search page$")
	    public void user_has_already_on_google_search_page() {
		 setUp("chrome", "https://www.google.com");
	       
	    }

	    @When("^user types (.+) in search input field and press enter key$")
	    public void user_types_selenium_interview_questions_in_search_input_field_and_press_enter_key(String textToBeSearched)  {
	 typeInput(driver.findElement(By.name("q")), textToBeSearched);
	 getActitveElement().sendKeys(Keys.ENTER);
	    	//    driver.findElement(By.name("q")).sendKeys(textToBeSearched,Keys.ENTER);
	    	
	    }

	    @Then("^User Should be able to get result page with title having (.+)$")
	    public void user_should_be_able_to_get_result_page_with_title_having_selenium_interview_questions(String textToBeSearched)  {
	    	System.out.println(getCurrentTitleOfApplication());
	    	System.out.println(textToBeSearched);
	    	Assert.assertTrue(getCurrentTitleOfApplication(textToBeSearched).contains(textToBeSearched),"Title is mismatched");	    	
	    	
	    }

	    @And("^close the browser$")
	    public void close_the_browser()  {
	       cleanUp();
	    }


}
