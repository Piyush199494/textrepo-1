package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameInputFieldElement=driver.findElement(By.id("username"));
		userNameInputFieldElement.clear();
		WebElement passwordInputElement=driver.findElement(By.name("password"));
		passwordInputElement.clear();
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
		if(actualurl.equals(expectedurl)) {
			System.out.println("login page is open succesfully");
		}else {
			System.out.println("validation for login page is failed");
		}
		//enter a valid username and password
        userNameInputFieldElement.sendKeys("admin");
        passwordInputElement.sendKeys("Test@123");
        driver.findElement(By.tagName("button")).click();
        System.out.println("Successfully logged in");
     //   WebDriverWait wait = new WebDriverWait(driver, 20);
      //  wait.until(ExpectedConditions.elementToBeClickable(By.id("menubar_item_right_LBL_SIGN_OU")));
       // driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
        driver.findElement(By.cssSelector("div[id='menubar_item_right_LBL_SIGN_OUT']")).click();
        	
        }
        
	}


