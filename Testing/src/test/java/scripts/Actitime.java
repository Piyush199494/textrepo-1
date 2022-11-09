package scripts;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class Actitime extends SeleniumUtility {
	@Parameters({"browser", "username", "password" })
	@BeforeTest
	public void Login(String browser,String username,String password) {
		setUp(browser, "https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("td>a.initial")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
		WebElement prDriver = driver.findElement(By.xpath("//td/input[@placeholder='Enter Customer Name']"));
		driver.findElement(By.xpath("//td/input[@placeholder='Enter Project Name']")).sendKeys("Foxtrot");
		prDriver.sendKeys("Acti");
        prDriver.click();
		//		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[text()='- Select Customer -']")).click();
//		driver.findElement(By.xpath("//div[@class='searchItemList']//div[text()='Big Bang Company']")).click();
//        driver.findElement(By.xpath("//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[text()='- Select Project -']")).click();
//        driver.findElement(By.xpath("//div[@class='searchItemList']//div[text()='Flight operations']")).click();
//        driver.findElement(By.xpath("//div[@id='createTasksPopup']//div[@class='tablePlaceholder']//table//tbody/tr/td[@class='nameCell first']/input[@placeholder='Enter task name']")).sendKeys("JetBuilding");
     //   driver.findElement(By.xpath("//div[@class='taskRowsTableContent']//table[@class='taskRowsTable']//tbody//tr//td[@class='typeOfWork']//div[text()='engineering']")).click();
     //   driver.findElement(By.xpath("//div[@class='typeOfWorkList']//div[text()='testing']")).click();
        driver.findElement(By.xpath("//label[@class='components_checkboxContainer checkboxContainer']/span[@class='checkmark checkMark'][1]")).click();
        driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
	}
	
	
  @Test
  public void Testcase1() {
	  driver.findElement(By.xpath("//div[@class='itemsContainer']//div[15]//div//div")).click();
	driver.findElement(By.xpath("//div[@class='itemsContainer']//div[16]")).click();
	  List<WebElement> task=driver.findElements(By.xpath("//tr//div[@class='namesContainer']"));
	  for(int i=0;i<task.size();i++) {
			System.out.println(task.get(i).getText());
		}
		if(task.contains("//div[text()='Jet Building']")) {
			System.out.println("Task is added succesfully");
		}
		else {
			System.out.println("Task not added");
		}
     }
	
  }

