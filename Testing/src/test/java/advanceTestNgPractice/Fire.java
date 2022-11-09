package advanceTestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fire {
  @Test
  public void Firefox() {
	//  System.setProperty("webdriver.gecko.driver", "D:\\workspace\\SeleniumBasic\\Executables\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	  
  }
}
