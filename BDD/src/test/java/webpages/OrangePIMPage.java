package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangePIMPage extends SeleniumUtility{
	WebDriver driver;
	public OrangePIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//ul//li[2]//a[@class='oxd-main-menu-item']")
	private WebElement pimclickElement;
	
	@FindBy(xpath = "//div/button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement foldclick;
	
	@FindBy(xpath = "//li[3]//a[@class='oxd-topbar-body-nav-tab-item']")
	private WebElement addbutton;
	
	@FindBy(name  = "firstName")
	private WebElement firstnameInput;
	
	@FindBy (name = "lastName")
	private WebElement lastnameInput;
	
	@FindBy (xpath = "//div//button[@type='submit']")
	private WebElement saveButtonPIM;
	
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input")
	private WebElement employeenameSearch;
	
	@FindBy(xpath = "//div[@role='listbox']/div/span[1]")
	private WebElement searchedEmployee;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy (xpath = "//div[text()='Raquel '] ")
	private WebElement nameToBeSearched;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editpencil;
	
	@FindBy(xpath ="//div[@class='orangehrm-tabs']//div[6]")
	private WebElement clickonJob;
	
	@FindBy (xpath = "//div[@class='oxd-form-row']//div[2]//div//div//div//div//div[2]")
	private WebElement jobtitleclick;
	
	@FindBy (xpath = "//div[@role='listbox']//div[18]")
	private WebElement jobSelect;
	
	@FindBy(xpath = "//div[text()='QA Engineer']")
	private WebElement jobname; 
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[5]")
	private WebElement subunitclick;
	
	@FindBy(xpath = "//div[@role='listbox']//div[3]")
	private WebElement subunitSelect;
	
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[6]//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement locationclick;
	
	@FindBy(xpath = "//div[@role='listbox']//div[2]")
	private WebElement locationSelect;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement deleteIconClick;
	
	@FindBy(xpath ="//i[@class='oxd-icon bi-trash oxd-button-icon']")
	private WebElement yespopupclick;
	
	
	public WebElement PIMClick() {
	  return  pimclickElement;	  
	}
	
	public WebElement yespopup() {
		return yespopupclick;
	}
	
	public WebElement AddButtonclick() {
	 return addbutton;		
	}
	public void AddEmployee(String firstname, String lastname) {
		clickOnElement(addbutton);
		typeInput(firstnameInput, firstname);
		typeInput(lastnameInput, lastname);
		clickOnElement(saveButtonPIM);
	}
	
	public void EditEmployee(String name) {
		clickOnElement(pimclickElement);
		clickOnElement(foldclick);
		typeInput(employeenameSearch, name);
		clickOnElement(searchedEmployee);
		clickOnElement(searchbutton);
		clickOnElement(editpencil);
		clickOnElement(clickonJob);
		clickOnElement(jobtitleclick);
		clickOnElement(jobSelect);
		clickOnElement(subunitclick);
		clickOnElement(subunitSelect);
		clickOnElement(locationclick);
		clickOnElement(locationSelect);
		clickOnElement(saveButtonPIM);
		
	}
	
	public void DeleteEmployee(String name) {
		clickOnElement(pimclickElement);
		clickOnElement(foldclick);
		typeInput(employeenameSearch, name );
		clickOnElement(searchedEmployee);
		clickOnElement(searchbutton);
		clickOnElement(deleteIconClick);
		clickOnElement(yespopupclick);
	}
	
public void EmployeeSearched(String firstName) {
	typeInput(employeenameSearch,firstName);
	clickOnElement(searchedEmployee);
	clickOnElement(searchbutton);
		
}
	public boolean ChecKEmployeeCreation() {
		return isElementExist(nameToBeSearched);	
	}
	
	public boolean ModifiedEmployee() {
		return isElementExist(jobname);
		
	}
	public boolean deletedEmployee() {
    return isElementExist(nameToBeSearched);
	}
}

