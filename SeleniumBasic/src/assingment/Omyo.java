package assingment;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omyo {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
	   Select carSelect=new Select(dropdown);
	   System.out.println(carSelect.isMultiple());
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(20))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select#multiselect1>option"))).click();
	   System.out.println(carSelect.getFirstSelectedOption().getText());
	   //in order to get count in a list
	   List<WebElement>option=carSelect.getOptions();
	   System.out.println(option.size());
	   for(int i=0;i<option.size();i++) {
		   System.out.println(option.get(i).getText());
	   }
	   carSelect.selectByIndex(0);
		carSelect.selectByIndex(2);
		carSelect.selectByIndex(3);
//		carSelect.selectByValue("Hyundaix");
//		carSelect.selectByVisibleText("Audi");
	}

}
