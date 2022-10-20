package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iebrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\workspaces\\seleniumbasics\\Executable\\IEDriverServer.exe");
		InternetExplorerDriver c1=new InternetExplorerDriver ();
		c1.get("http://demo.actitime.com/login.do");
		String actualurl=c1.getCurrentUrl();
		String actualTitle=c1.getTitle();
		System.out.println("Actual Url is "+actualurl);
        System.out.println("Actual title is "+actualTitle);
	}

}
