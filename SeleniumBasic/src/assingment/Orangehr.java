package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UsernameInput=driver.findElement(By.name("username"));
		UsernameInput.sendKeys("Admin");
		WebElement passwordInput=driver.findElement(By.name("password"));
		passwordInput.sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		//driver.findElement(by)
		
	}

}
