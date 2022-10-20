package cssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement loginbutton=driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("cssvalue of color "+loginbutton.getCssValue("color"));
		String actualcolorString="rgba(255, 255, 255, 1)";
		String expectedcolorString="rgba(255, 255, 255, 1)";
		System.out.println(actualcolorString.equals(expectedcolorString));

	}

}
