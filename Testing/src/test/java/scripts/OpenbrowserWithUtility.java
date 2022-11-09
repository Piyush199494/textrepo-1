package scripts;

import org.openqa.selenium.WebDriver;


public class OpenbrowserWithUtility {

	public static void main(String[] args) {
		utilities.SeleniumUtility m1=new utilities.SeleniumUtility();
		WebDriver driver=m1.setUp("chrome", "http://www.flipkart.com");
		System.out.println(m1.getCurrentTitleOfApplication());

	}

}
