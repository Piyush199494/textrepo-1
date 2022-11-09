package assingment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class Jquery1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
      // Create the instance of chrome browser
  WebDriver driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
//	find the  1 webpage 
//click on controlgroup button
	driver.findElement(By.xpath("//a[text()='Controlgroup']")).click();
	//driver.switchTo().frame(0);//1.by index
	//2. by element
WebElement frame=	driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame);
driver.findElement(By.xpath("//label[@for='transmission-standard']")).click();
driver.switchTo().defaultContent();
//Click on sortable
driver.findElement(By.xpath("//a[text()='Sortable']")).click();

//move in next frame 
WebElement frame2=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame2);
Actions action =new Actions(driver);
List<WebElement> source=driver.findElements(By.cssSelector(".ui-sortable>li"));
WebElement target=driver.findElement(By.cssSelector("html[lang=\"en\"]> body>ul>li"));
for (int i=source.size()-1;i>=0;i--)
{
	System.out.println(source.get(i).getText());
}

for (int i=source.size()-1;i>=0;i--)
{
	performDragAndDrop(action,source.get(i),target);
	Thread.sleep(2000);
}

	}
	private static void performDragAndDrop(Actions action, WebElement src, WebElement target) {
		// TODO Auto-generated method stub
		action.dragAndDrop(src, target).build().perform();
	}

}
