package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser2 {

	public static void main(String[] args) {
		//step 1: use System.setProperty
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver cd= new ChromeDriver();
		cd.get("http:www.facebook.com");
		

	}

}
