package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarenapagination {

	public static void main(String[] args) {
		//step1:use system class and set drivers
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe ");
		//step2:create an instance of driver using webdriver interface
		WebDriver driver=new ChromeDriver();
		//step3:maximize the window
		driver.manage().window().maximize();
		//step4:open url
		driver.get("https://www.gsmarena.com");
		//step5: open realme phone
       List<WebElement> phonelistElements=driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
             for(WebElement option: phonelistElements) {
            	 if(option.getText().contains("SAMSUNG")) {
            		 option.click();
            	 }
             }
             List<WebElement> paginationElements=driver.findElements(By.cssSelector("div.nav-pages>a"));
             System.out.println(paginationElements.size());
             if(paginationElements.size()>0) {
            	 System.err.println("pagination exist");
             
             for(int i=0;i<paginationElements.size();i++) {
            	 paginationElements.get(i).click();
             }
        }else {
        	System.out.println("pagination does not exist");
        }
	}
	
}


