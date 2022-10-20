package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Equals1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String actualurl=driver.getCurrentUrl();
		System.out.println("Actual url is " +actualurl);

		
	String expectedurl="https://www.myntra.com/";
	System.out.println("URL validation"+actualurl.equals(expectedurl));
	String pageSource=driver.getPageSource();
	System.out.println("page source length "+pageSource.length());
	System.out.println("page source content "+pageSource);
		

	}

}
