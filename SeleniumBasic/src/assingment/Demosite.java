package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//execution admin
public class Demosite {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\workspaces\\seleniumbasics\\Executable\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demosite.executeautomation.com/Login.html");
        WebElement userInputElement=driver.findElement(By.name("UserName"));
        userInputElement.sendKeys("execution");
        WebElement passwordElement=driver.findElement(By.name("Password"));
        passwordElement.sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://demosite.executeautomation.com/Login.html";
        if(actualurl.equals(expectedurl)) {
        	System.out.println("login page opened successfully");
        	
        }else {
        	System.out.println("unable to access login page");
        }
        driver.findElement(By.name("Login")).click();
     //   driver.close();
        
	}

}
