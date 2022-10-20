package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		//step1:set path for particular browser
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		//step2 create an instance of webdriver
		WebDriver driver=new ChromeDriver();
		//step 3 pass the url using get method
		driver.get("https://demo.actitime.com");
		//step4 use implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//find elements
		driver.findElement(By.name("username")).sendKeys("admin");
		//find password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//find login
		driver.findElement(By.id("loginButton")).click();
		//fluent wait declaration
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(20))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink"))).click();
		System.out.println("Home page title "+driver.getTitle());
		
		
	}

}
