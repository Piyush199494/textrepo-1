package googlepages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;


public class GoogleSearch extends SeleniumUtility {
	//We initialized current page using page factory
	public GoogleSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="q")
private WebElement SearchInputField;
public void SearchText(String text) {
	typeInput(SearchInputField, text);
getActiveElementFromUI().sendKeys(Keys.ENTER);
	
}
}
