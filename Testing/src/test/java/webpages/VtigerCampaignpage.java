package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerCampaignpage extends SeleniumUtility {
	WebDriver driver;
	 public VtigerCampaignpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	    @FindBy(css="#appnavigator")
		private WebElement flowNavigator;
		
		@FindBy(css=".app-list.row>div:nth-of-type(2) .app-name")
		private WebElement selectMarketingOption;
		
		@FindBy(xpath = "//a[@title='Campaigns']")
		private WebElement selectCampaignOption;
		
		@FindBy(xpath = "//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")
        private WebElement addCampaignButton;

		@FindBy(xpath = "//input[@class='inputElement nameField']")
        private WebElement campaignName;
		
		@FindBy(xpath = "//input[@class='dateField form-control ']")
		private WebElement CampaignDate;
		
		@FindBy(xpath = "//button[@class='btn btn-success saveButton']")
		private WebElement saveCampaign;
		
		@FindBy(xpath = "//button[@id='Campaigns_detailView_basicAction_LBL_EDIT']")
		private WebElement editCampaign;
		
		@FindBy(xpath = "//*//tr[2]//td[2]/div[@id='s2id_autogen3']")
		private WebElement campaignstatus;
		
		@FindBy(xpath = "//div[@id='select2-drop']//ul/li[2]")
		private WebElement selectPlanning;
		
		@FindBy(xpath = "//*//tr[2]//td[4]//div[@id='s2id_autogen5']")
		private WebElement campaignTypElement;
		
		@FindBy(xpath = "//div[@id='select2-drop']/ul/li[2]")
		private WebElement selectConference;
		
		@FindBy(xpath = "//button[@class='btn btn-success saveButton']")
		private WebElement saveButton;
		
		@FindBy(xpath = "//h4[@class='module-title pull-left text-uppercase']")
		private WebElement campaignclick;
		
		@FindBy(xpath = "//input[@class='listViewEntriesCheckBox']")
		private WebElement checkbox;
		
		@FindBy (xpath = "//button//i[@class='fa fa-trash']")
		private WebElement deleteCampaign;
		
		@FindBy(xpath = "//a[text()='DefExpo']")
		private WebElement newlycreatedCampaign;
		
		@FindBy(xpath = "//input[@class='listViewEntriesMainCheckBox']")
		private WebElement selectCampaignCheckbox;
		
		@FindBy(xpath = "//span[@class='picklist-color picklist-128-Conference']")
		private WebElement modifiedElement;
		
		@FindBy(xpath = "//input[@class='listViewEntriesCheckBox']")
		private WebElement newlyaddedelElementcheckboxWebElement;
		
		@FindBy(xpath="//button[@data-bb-handler='confirm']")
		private WebElement yesButtonOnConfirmPopup;
		
		@FindBy(xpath = "//button[@id='Campaigns_listView_massAction_LBL_EDIT']")
		private WebElement pencil;
		
		
		public void CreateCampaign(String name, String date) {
			clickOnElement(addCampaignButton);
			typeInput(campaignName, name);
			typeInput(CampaignDate, date);
			clickOnElement(saveCampaign);
			ClickOnHeader();
			
		}
		
		public void ClickOnHeader() {
			clickOnElement(campaignclick);
			
		}
		public boolean CheckCampaignCreation() {
			return isElementExist(newlycreatedCampaign);
			
		}
		
		public void EditCampaign() {
			clickOnElement(newlycreatedCampaign);
			clickOnElement(editCampaign);
			clickOnElement(campaignstatus);
			clickOnElement(selectPlanning);
			clickOnElement(campaignTypElement);
			clickOnElement(selectConference);
			clickOnElement(saveButton);
			ClickOnHeader();
		}
		
		public void selectcheckbox() {
			clickOnElement(selectCampaignCheckbox);	
		}
		
		public boolean CampaignModification() {
			return isElementExist(modifiedElement);		
		}
		
		public void DeleteCampaign() {
			clickOnElement(newlyaddedelElementcheckboxWebElement);
			clickOnElement(deleteCampaign);
			clickOnElement(yesButtonOnConfirmPopup);
			}
		
			
		}
		
		
		






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

