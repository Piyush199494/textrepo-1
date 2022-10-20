package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[]args) throws InterruptedException {
	//step1:use system class and set browser driver and its location
	System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
	//step2:Create an instance 
	WebDriver driver=new ChromeDriver();
	//step2:set the size of page
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().setSize(new Dimension(500, 600));
	//step4:open url
	driver.get("https://www.amazon.in/");
	//Step5:maximize window
	driver.manage().window().maximize();
	//Step6:print the page title
	System.out.println(driver.getTitle());
	String title1=driver.getTitle();
	//step7:browse other page or step into menu
	driver.findElement(By.partialLinkText("Mobiles")).click();
	//driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
	driver.navigate().back();
	String titleString =driver.getTitle();
	System.out.println(title1.equals(titleString));
//	driver.findElement(By.cssSelector("a.[class='nav-a  ']"));
	driver.close();

	// WebDriverWait wait = new WebDriverWait(driver, 10);
     //   wait.until(ExpectedConditions.elementToBeClickable(By.id("nav_cs_apay")));
      //  driver.findElement(By.id("nav_cs_books"))/a(1).click();
///Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	//		.withTimeout(Duration.ofSeconds(30))
	//		.pollingEvery(Duration.ofSeconds(5))
		//	.ignoring(NoSuchElementException.class);
	        
//*[]@id
        

}


}
