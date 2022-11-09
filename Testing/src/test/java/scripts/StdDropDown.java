package scripts;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;


public class StdDropDown {

	public static void main(String[] args) {
		SeleniumUtility s=new SeleniumUtility();
		WebDriver driver=s.setUp("chrome", "http://omayo.blogspot.com/");
		
	}

}
