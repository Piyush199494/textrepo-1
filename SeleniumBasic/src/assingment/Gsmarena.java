package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		// step1:use system class and set driver
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		//step2:by using webdriver interface create an instance of drivers
		WebDriver driver=new ChromeDriver();
		//step3:open the browser
		driver.get("https://www.gsmarena.com/");
		//step4:validate home page
		String actualtitle=driver.getTitle();
		System.out.println(driver.getTitle());
		String expectedtitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("validation is a match");
		}else {
			System.out.println("validation is not a match");
		}
		
		List<WebElement> phoneNamelist=driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		System.out.println("phone list "+phoneNamelist.size());
		WebElement firstphoneNAmElement=phoneNamelist.get(0);
		for(int i=0;i<phoneNamelist.size();i++) {
			System.out.println(phoneNamelist.get(i).getText());
		}
				
	}

}
