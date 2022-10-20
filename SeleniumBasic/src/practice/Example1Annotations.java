package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Example1Annotations {
	static WebDriver driver;
  @Test
  public void f() {
	  SeleniumUtility util=new SeleniumUtility();
	 driver=util.setUp("chrome ", "https://erail.in/");
	 
	  
	  
	  
	  
  }
}
