package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		//step1: use System class and set drivers
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		//step2: use webdriver interface and make an instance of chromedriver
		WebDriver driver=new ChromeDriver();
		//step3:open browser using object and get method
		driver.get("https://www.google.com/");
		//step4:open any desired website on chrome browser by using get() of webdriver interface
		driver.get("https://www.demoblaze.com/");
		//step7:maximize the browser window
		driver.manage().window().maximize();
		//step8:use implicit synchronization 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//step9:Use list interface in order to get the list of mobile phones and respective price
		List<WebElement> mobilephoneNameElements=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement>mobilephonepriceElements=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		for(int i=0;i<mobilephoneNameElements.size();i++) {
			System.out.println(mobilephoneNameElements.get(i).getText()  +"  "+mobilephonepriceElements.get(i).getText());
		}
		

	}

}
