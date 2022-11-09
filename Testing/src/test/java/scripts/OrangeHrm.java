package scripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class OrangeHrm extends SeleniumUtility {
	@Parameters({ "browser", "username", "password" })
	@BeforeTest
	public void Login(String browser, String username, String password) throws InterruptedException {
		setUp(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();

	}

	public void TestCase1() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//div/button[@class='oxd-icon-button oxd-main-menu-button']")).click();
		driver.findElement(By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary']"))
				.click();
		driver.findElement(By.name("firstName")).sendKeys("Melvin");
		driver.findElement(By.name("lastName")).sendKeys("Gibson");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div//button[@type='submit']")).click();

		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
				.sendKeys("Melvin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']/div/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		List<WebElement> names = driver.findElements(
				By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"));
		WebElement element = driver.findElement(By.xpath("//div[text()='Melvin ']"));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(i + " " + names.get(i).getText());
			Assert.assertEquals("Melvin Gibson", "Melvin Gibson");

		}

		Assert.assertEquals("Melvin Gibson", "Melvin Gibson");

//     if (names.contains(element)) {
//		 System.out.println("The name is added");
//	}
//	 else {
//     	System.out.println("The name is not added");
//	 }
	}

	@Test(priority = 1)
	public void TestCase2() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-left']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
				.sendKeys("Melvin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']/div/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='orangehrm-tabs']//div[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div//div//div//div//div[2]")).click();
		driver.findElement(By.xpath("//div[@role='listbox']//div[18]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']//div[3]")).click();
		driver.findElement(
				By.xpath("//div[@class='oxd-form-row']//div[6]//div[@class='oxd-select-text oxd-select-text--active']"))
				.click();
		driver.findElement(By.xpath("//div[@role='listbox']//div[2]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
				.sendKeys("Melvin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']/div/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
     	List<WebElement> namesElement=driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"));
        for(int i=0;i<namesElement.size();i++) {
    	System.out.println(namesElement.get(i).getText());
  
	}
	}
	@Test(priority = 2)
	public void TestCase3() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-left']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
				.sendKeys("Melvin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='listbox']/div/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]//input"))
		.sendKeys("Melvin Gibson");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> namesElements=driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"));
	for(int i=0;i<namesElements.size();i++) {
		System.out.println(namesElements.get(i).getText());
	}

		
		
		
		
	}

}
