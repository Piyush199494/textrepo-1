package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("span.langCardClose")).click();
		driver.findElement(By.cssSelector("div.fsw_inner.returnPersuasion>*:nth-child(4)>label")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>div.DayPicker-Body>*:nth-child(3)>div>div>p")).click();
		driver.findElement(By.cssSelector("div.fsw>*:nth-child(3)>a")).click();
		
	}

}
