package practice;

import java.io.IOException;

import javax.swing.text.AbstractDocument.ElementEdit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropdown {

	public static void main(String[] args) throws IOException {
		SeleniumUtility m1=new SeleniumUtility();
		WebDriver driver=m1.setUp("chrome", "http://omayo.blogspot.com/");
	//    By dropdown=By.id("multiselect1");
	    
	  //  Select select=new Select(driver.findElements("volvox"));
	System.out.println(m1.gettitle());
	m1.handleHtmlDropdownListWithVisibleText(null, null);
	
	}

}