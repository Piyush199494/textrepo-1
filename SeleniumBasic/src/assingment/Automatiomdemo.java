package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatiomdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> menuList=driver.findElements(By.cssSelector("ul.nav.navbar-nav>li>a"));
		System.out.println(driver.getTitle());
		System.out.println(menuList.size());
		for(int i=0;i<menuList.size();i++) {
			System.out.println(menuList.get(i).getText());
		}

	}

}
