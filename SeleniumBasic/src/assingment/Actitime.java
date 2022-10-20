package assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspaces\\seleniumbasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("td>a.initial")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
        driver.findElement(By.cssSelector("div.customerSelector>div.components_combobox>div>*:nth-child(2)>div>div")).click();
	}

}



//driver.findElement(By.cssSelector("div.item.createNewCustomer")).click();
//	driver.findElement(By.cssSelector("div.customerNameDiv>input.inputFieldWithPlaceholder")).sendKeys("Android Tester");
//	driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div>div")).click();
//	driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
//	driver.findElement(By.cssSelector("div.emptySelection")).click();
//	driver.findElement(By.cssSelector("input.newCustomer")).sendKeys("Android Tester");
//	driver.findElement(By.cssSelector("div[class='dropdownButton']")).click();
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.searchItemList>div.itemRow"))).click();
//	driver.findElement(By.cssSelector("td>div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div.components_combobox.cpCombobox>div>div>div>div>div.itemRow")).click();
	//driver.findElement(By.cssSelector("div.searchItemList>div.itemRow")).click();;
//	driver.findElement(By.className("newCustomer")).sendKeys("Manual tester");
//	driver.findElement(By.className("newProject")).sendKeys("S&S corp");
//	driver.findElement(By.cssSelector("div.addTasksLink")).click();
