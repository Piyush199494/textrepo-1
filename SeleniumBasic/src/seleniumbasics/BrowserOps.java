package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOps {

	public static void main(String[] args) throws InterruptedException {
		//step 1: use system class and set browser and driver location
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
        //step2: create an instance of webdriver
		WebDriver driver=new ChromeDriver();
		//step 3:setsize of window
		Thread.sleep(4000);
		driver.manage().window().setSize(new Dimension(1000, 1000));;
		//step4: maximize window
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//step5: open url using get method
		driver.get("http://demo.actitime.com");
		//step 6:put username 
		WebElement usernameinputElement=driver.findElement(By.name("username"));
		usernameinputElement.sendKeys("admin");
		//step7:put password
		WebElement passwordinputElement=driver.findElement(By.name("pwd"));
		passwordinputElement.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//step8:click on tasks
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("container_tasks")).click();
		//step9:go backward
		Thread.sleep(2000);
		driver.navigate().back();
		//step10:go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		String title=driver.getTitle();
		//title of task page
		String expectedtitleString="actiTIME - Task List";
		System.out.println(title);
		System.out.println(title.equals(expectedtitleString));
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
		
		
		
	}

}
