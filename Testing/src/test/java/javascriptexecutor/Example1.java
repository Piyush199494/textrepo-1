package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;


public class Example1 extends SeleniumUtility{
  @Test
  public void TestCase1() {
	  WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	  //Using conventional method find locator
	  WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
	  //by using JavascriptExecutor perform click operation so convert  webdriver instance into JavascriptExecutor  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", element);
  }@Test
  public void TestCase2() {
	  //use webdriver and make an instance of it
	  WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	  //now convert webdriver instance into javascriptExecutor
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	
}
}
