package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		driver=util.setUp("chrome","https://demo.actitime.com/login.do");
		
		WebElement element=driver.switchTo().activeElement();
		String exp=element.getAttribute("placeholder");
		if(exp.equals("Username")) {
			System.out.println("Mouse pointer is in username field");
			element.sendKeys("admin",Keys.TAB);
		}
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
