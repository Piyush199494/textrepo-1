package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class Example3 extends SeleniumUtility {
  @Test
  public void TestCase1() {
	  WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
	  driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //vertical scrolling
	  js.executeScript("window.scrollBy(0,2500)");
	  setSleepTime(2000);
	  js.executeScript("window.scrollBy(0,-2500)");
	  //horizontal scrolling
	//  js.executeScript("window.scrollBy(5000,0)");
  }
}
