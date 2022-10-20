package assingment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Redbus {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.redbus.in/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("div>input#src")).sendKeys("pune");
	driver.findElement(By.cssSelector("ul.autoFill.homeSearch>li")).click();
	driver.findElement(By.cssSelector("div>input#dest")).sendKeys( "Goa");
	driver.findElement(By.cssSelector("ul.autoFill.homeSearch>*:nth-child(4)")).click();
	driver.findElement(By.cssSelector("div#search_div>section>div>*:nth-child(4)>div>input#onward_cal")).click();
	driver.findElement(By.cssSelector("table.rb-monthTable.first>tbody>*:nth-child(6)>*:first-child")).click();
	driver.findElement(By.id("search_btn")).click();
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li>*:nth-child(2)")).click();
	driver.findElement(By.cssSelector("ul.list-chkbox>*:nth-of-type(3)>label.custom-checkbox")).click();
	List<WebElement> buses=driver.findElements(By.cssSelector("div.clearfix.row-one>div>div"));
	List<WebElement> price=driver.findElements(By.cssSelector("div.column-seven.p-right-10.w-15.fl>div>div>span"));
	for(int i=0;i<buses.size();i++) {
		System.out.println(buses.get(i).getText());
	}
	for(int i=0;i<price.size();i++) {
		System.out.println(price.get(i).getText());
	}

}

}
/**driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.list-chkbox>*:nth-of-type(3)>label.custom-checkbox"))).click();**/
