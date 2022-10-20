package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Equals2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.youtube.com ");
		String actualurl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		String expectedurl="http:\\\\www.youtube.com";
		String expectedTitle="YouTube Home";
		System.out.println("Url validation "+actualurl.equals(actualurl));
		System.out.println("Title validation "+actualTitle.equals(expectedTitle));
	}

}
