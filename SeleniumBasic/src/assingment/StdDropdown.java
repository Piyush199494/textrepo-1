package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		//std dropdown will always have select tag thus in this condition we need to use select method
		//step1:identify dropdown list
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		//step2:create an instance of select class and pass the above element into its constructor
		Select skillSelect=new Select(skilldropdown);
		//step3:Check whether the dropdown is multiselect or not
		System.out.println("is multi select or not "+skillSelect.isMultiple());
		//step4:In order to select options default or any other create an webelement
		WebElement selectoption=skillSelect.getFirstSelectedOption();
		String nameoffirstselectedoption=selectoption.getText();
		System.out.println(skillSelect.getFirstSelectedOption().getText());
		//step5: get list count of skills
		List<WebElement> optionsElements=skillSelect.getOptions();
		for(int i=0;i<optionsElements.size();i++) {
			System.out.println("Options "+i+ "  "+optionsElements.get(i).getText());
		}
	    skillSelect.selectByIndex(4);
		System.out.println(skillSelect.getFirstSelectedOption().getText());
		//can also do the same thing using getvalue or by visible text method
		skillSelect.selectByValue("Android");
		System.out.println("By using value " +skillSelect.getFirstSelectedOption().getText());
		skillSelect.selectByVisibleText("Backup Management");
		System.out.println("By visible text " +skillSelect.getFirstSelectedOption().getText());
		//Now check whether dropdown list is in ascending order or not
		String skillName="";
		for(int i=1;i<optionsElements.size();i++) {
			if(optionsElements.size()-1!=i) {
				skillName=skillName+optionsElements.get(i).getText();
			}
			else {
				skillName=skillName+optionsElements.get(i).getText();
			}
		}
		
		String expectedSkill="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";	
	    System.out.println("skillname "+skillName);
		System.out.println("expected skillname "+expectedSkill);
		System.out.println("Compare if it is ascending order or not "+skillName.equals(expectedSkill));
		//perform validation on year
	WebElement yeardropdown=driver.findElement(By.id("yearbox"));
	//now create an instance
	Select yearSelect=new Select(yeardropdown);
	System.out.println("is it multi select "+yearSelect.isMultiple());
	List<WebElement>noofyearElements=yearSelect.getOptions();
	System.out.println(noofyearElements.size());
	for(int i=0;i<noofyearElements.size();i++) {
		System.out.println("no of year "+noofyearElements.get(i).getText());
		
	}
		
	WebElement monthdropdownElement=driver.findElement(By.cssSelector("div.col-sm-6>form>*:nth-child(11)>*:nth-child(3)>select"));
	Select monthSelect=new Select(monthdropdownElement);
	System.out.println("is multi select "+monthSelect.isMultiple());
	List<WebElement>MonthsElements=monthSelect.getOptions();
	System.out.println(MonthsElements.size());
	for(int i=1;i<MonthsElements.size();i++) {
		System.out.println("no of months "+MonthsElements.get(i).getText());
	}
		
    WebElement daydropdownElement=driver.findElement(By.cssSelector("div.col-sm-6>form>*:nth-child(11)>*:nth-child(4)>#daybox"));
    Select daySelect=new Select(daydropdownElement);
    System.out.println(daySelect.isMultiple());
    List<WebElement>dayElements=daySelect.getOptions();
    System.out.println(dayElements.size());
    for(int i=1;i<dayElements.size();i++) {
    	System.out.println("days "+dayElements.get(i).getText());
    }

	}

}
