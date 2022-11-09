package webscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerOrganizationPage extends SeleniumUtility {
	WebDriver driver;

	public VtigerOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Accounts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addorganization;

	@FindBy(id = "Accounts_editView_fieldName_accountname")
	private WebElement orgnizationname;

	@FindBy(id = "Accounts_editView_fieldName_phone")
	private WebElement orgnizationnumb;

	@FindBy(id = "Accounts_editView_fieldName_ownership")
	private WebElement orgnizationowner;

	@FindBy(css = ".saveButton")
	private WebElement saveButtonFororgization;

	@FindBy(xpath = "//h4[text() =' Organizations ']")
	private WebElement orgnizationHeaderLink;

	@FindBy(xpath = "//a[contains(text(),'Bhagyaa3')]")
	private WebElement newlyCreatedorgnizationName;

	@FindBy(xpath = "//tr[td[span[span[a[contains(text(),'Bhagyaa3')]]]]]/td[1]//input")
	private WebElement newlyCreatedCheckBox;

	@FindBy(id = "Accounts_detailView_basicAction_LBL_EDIT")
	private WebElement editElement;

	@FindBy(id = "Accounts_editView_fieldName_website")
	private WebElement website;

	@FindBy(id = "Accounts_listView_massAction_LBL_DELETE")
	private WebElement deleteorganizationlink;

	@FindBy(xpath = "//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;

	@FindBy(css = ".listViewEntriesMainCheckBox")
	private WebElement selectAllLeadsCheckBoxs;

	@FindBy(css = "#listview-table>tbody>tr")
	private WebElement getallorgnization;
	
	@FindBy(xpath = "//input[@id='Accounts_editView_fieldName_fax']")
	private WebElement inputfax;
	
	
	public void navigateToOrganization() {
		
	}

	public void CreateNewOrgnization(String orgname, String phonenumb, String owner) {
		clickOnElement(addorganization);
		typeInput(orgnizationname, orgname);
		typeInput(orgnizationnumb, phonenumb);
		typeInput(orgnizationowner, owner);
		clickOnElement(saveButtonFororgization);
		clickonheader();

	}

	public void clickonheader() {
		clickOnElement(orgnizationHeaderLink);

	}
	
	public void ModiFication(){
		clickonheader();
		clickOnElement(newlyCreatedorgnizationName);
		clickOnElement(editElement);
		typeInput(website, "www.bhagya.com");
		clickOnElement(saveButtonFororgization);
	}

	public void deleteCreatedorgnization() {
		clickonheader();
		clickOnElement(newlyCreatedCheckBox);
		clickOnElement(deleteorganizationlink);
		clickOnElement(yesButtonOnConfirmPopup);

	}

	public boolean checkorgnizationCreation() {
		return isElementExist(newlyCreatedorgnizationName);
	}

	public void selectAllorgnizationCheckBox() {
		clickOnElement(selectAllLeadsCheckBoxs);
	}

	public void clickOnDeleteLogo() {
		clickOnElement(deleteorganizationlink);
	}

	public void confirmorgnizationDeletion() {
		clickOnElement(yesButtonOnConfirmPopup);
	}

	public String getorgnizationList(String value) {
		return getRequiredAttributeValue(getallorgnization, value);
	}

	
}



