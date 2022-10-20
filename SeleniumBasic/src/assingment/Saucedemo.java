package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//standard_user pass-secret_sauce
public class Saucedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement usernameInputDriver=driver.findElement(By.id("user-name"));
		usernameInputDriver.sendKeys("standard_user");
		WebElement passwordTnputElement=driver.findElement(By.id("password"));
		passwordTnputElement.sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
	   //	WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

}


