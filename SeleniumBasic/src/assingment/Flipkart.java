package assingment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		//step1:set path for driver
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		//step2:use webdriver interface and create an instance of drivers
		WebDriver driver=new ChromeDriver();
		//step3:open chrome browser
		driver.get("https://www.google.com/");
		//step4: maximize window
		driver.manage().window().maximize();
		//step5:put url of flipkart
		driver.get("https://www.flipkart.com/");
		//step6:close the popup of the flipkar site
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		//step7:get the menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector("div._331-kn._2tvxW>div>div>div"));
		//step8:print menu list
		System.out.println("Menulist count "+menuList.size());
		WebElement FirstMenu=menuList.get(0);
		//step9:print menu names or text using for loop
		for(int i=0;i<menuList.size();i++) {
			System.out.println("Menu list "+menuList.get(i).getText());
		}
		
		

	}

}
