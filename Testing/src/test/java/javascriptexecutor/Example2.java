package javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;


public class Example2 extends SeleniumUtility {
  @Test
  public void TestCase1() {
	  //create an webdriver instance
	  WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
	  //convert webdriver instance into JavascriptExecutor
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	//identifying elements from the UI using JavaScript and typing required value in it
	  js.executeScript("document.getElementById('username').value='admin'");
	//identifying elements from the UI using JavaScript and typing required value in it
	  js.executeScript("document.getElementsByName('pwd') [0].value='manager'");
	  js.executeScript("document.getElementById('loginButton').click();");
	  //or make a webelement first and pass that element into JavascriptExecutor
	//  WebElement element=driver.findElement(By.id("loginButton"));
	//  js.executeScript("arguments[0].click();",element);
	  
  }
}
