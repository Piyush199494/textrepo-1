package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {
		//step1:use system class and set drivers
	 System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
	 //Step2:create an instance of driver by using webdriver interface
	 WebDriver driver=new ChromeDriver();
	 //step3:open desired website using url
	 driver.get("https://www.espncricinfo.com/");
	 //step4:get home page title and validate it.
	 System.out.println("Tile of home page "+driver.getTitle());
	 String actualtitle=driver.getTitle();
	 String expectedtitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
	 if(actualtitle.equals(expectedtitle)) {
		 System.out.println("validated title is a match");
	 }else {
		 System.out.println("validated title is not a match");
	 }
	 //step5:get the menu list and print it
	List<WebElement> menuList=driver.findElements(By.cssSelector("div.ds-flex.ds-flex-row.ds-items-center.ds-justify-start>div>div>div"));
	//step6:print menu list
	System.out.println("menu list of cricinfo "+menuList.size());
	WebElement Firstmenuitem=menuList.get(0);
	for(int i=0;i<menuList.size();i++) {
		System.out.println("items from menu list "+menuList.get(i).getText());
	}

	}

}
