package assingment2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {

  @Test

  public void f() {
		 System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://erail.in/");
		 driver.manage().window().maximize();
		// get current window unique id
			String homePageWinId = driver.getWindowHandle();//T1
			System.out.println("Home page window ID: " + homePageWinId);

			driver.findElement(By.xpath("//a[text()='eCatering']")).click();

			// get all windows unique IDs which are opened by selenium current instance
			Set<String> allWinIds = driver.getWindowHandles();
			System.out.println("All windows ID: " + allWinIds);//T1,T2

			// remove home window id from all window id dn you will get child window id
			allWinIds.remove(homePageWinId);//T2
			System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);

			// get child window id using iterator
			Iterator<String> itr = allWinIds.iterator();
			String childWinId = itr.next();
			//now you can switch you control from Main window to child window
			driver.switchTo().window(childWinId);
					//or
			// switch control to child window
			//driver.switchTo().window(allWinIds.iterator().next());
			driver.findElement(By.xpath("//input [@placeholder='Search Train or Station to explore']")).click();
			driver.findElement(By.xpath("//input [@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[text()='KARNATAKA EXP']")).click();
		 Actions act= new Actions(driver);
		 WebElement calendar=driver.findElement(By.xpath("//input[@placeholder='Boarding Date']"));
		 calendar.click();
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ARROW_DOWN);
	calendar.sendKeys(Keys.ENTER);
	WebElement station=driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
	Select s1=new Select(station);
	s1.selectByValue("DMM");
	driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
	List<WebElement>restaurantnames=driver.findElements(By.xpath("//div[@class='flex flex-col']/div/div/div[1]/div[3]/span[2]"));
	for(int i=0;i<restaurantnames.size();i++) {
		System.out.println(restaurantnames.get(i).getText());
	}
		  
  }
}
