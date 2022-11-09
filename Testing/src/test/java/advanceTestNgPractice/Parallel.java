package advanceTestNgPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;


public class Parallel extends SeleniumUtility {
  @Parameters({"browser", "username", "password" })
  @Test
  public void testloginofvtiger() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  //implicit wait
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //maximize the browser
	  driver.manage().window().maximize();
	  driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys("Test@123",Keys.ENTER);
  }
  @Parameters({"browser", "username", "password" })
  @Test
  public void Actitime() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/");
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager",Keys.ENTER);	
}

}

