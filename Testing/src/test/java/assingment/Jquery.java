package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;


public class Jquery {
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		driver=util.setUp("chrome", "https://jqueryui.com/");
	    driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
	 //   driver.switchTo().frame(0);
	    //we can do above thing in another way like
	    WebElement e1=driver.findElement(By.xpath("//div[@id='content']//iframe"));
	  driver.switchTo().frame(e1); 
	  driver.findElement(By.xpath("//label[@for='radio-1']")).click();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.cssSelector(".logo")).click();
	}

}
