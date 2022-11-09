package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingFrames {

	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		driver=util.setUp("chrome","https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		//taking control inside the frame from main page
		driver.switchTo().frame(0);
//		//Identify the frame 
//		WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
//		//switch control to the frame
//		driver.switchTo().frame(e1);
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	 //util.cleanUp();
	}

}
