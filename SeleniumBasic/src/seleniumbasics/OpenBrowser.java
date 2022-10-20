package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\workspaces\\seleniumbasics\\Executable\\geckodriver.exe");
		//step2 : Create an instance
		WebDriver f1=new FirefoxDriver();
		f1.get("http://demo.actitime.com/login.do");
		String ActualUrl=f1.getCurrentUrl();
		String ActualTitle=f1.getTitle();
		System.out.println("Actual Url "+ActualUrl);
		System.out.println("Actual Title "+ActualTitle);
		
		
	}

}
