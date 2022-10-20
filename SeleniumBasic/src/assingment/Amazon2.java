package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().back();
		String titleString =driver.getTitle();
		System.out.println(title1.equals(titleString));
		System.out.println("*****************************************************************");
		//step8:browse other page or step into menu
		driver.navigate().to("https://www.amazon.in/events/greatindianfestival?ref_=nav_cs_gb");
		System.out.println(driver.getTitle());
		String title3=driver.getTitle();
		System.out.println(title1.equals(title3));
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("*****************************************************************");
		//step9:browse other page or step into menu
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.getTitle();
		String Title4=driver.getTitle();
		System.out.println(Title4.equals(title1));
		driver.navigate().to("https://www.amazon.in/");;

	}

}
