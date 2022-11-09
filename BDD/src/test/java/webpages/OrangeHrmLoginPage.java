package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility {
	static WebDriver driver;
	public OrangeHrmLoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "username")
	private WebElement usernameInput;
	
	@FindBy(name = "password")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	public void LoginOnOrangeHrm(String username, String password) {
		typeInput(usernameInput, username);
		typeInput(passwordInput, password);
		clickOnElement(loginbutton);
		
	}
	

}
