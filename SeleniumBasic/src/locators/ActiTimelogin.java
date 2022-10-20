package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimelogin {

	public static void main(String[] args) {
		//Step 1: open browser through relative path
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Step 2:enter app url
		driver.get("https://demo.actitime.com/");
		//step 3: enter username as admin,so locate username field form ui
		WebElement usernameInputfield=driver.findElement(By.id("username"));
		/** after identifying the WebElement we can perform following operation in it
		 * 	type input---->  sendKeys("")
		 *  click     ---->  click()
		 *  delete existing ----> clear()
		 * */
		usernameInputfield.sendKeys("admin");
		//step 4: Enter password as manager
		WebElement passwordInputFieldElement=driver.findElement(By.name("pwd"));
		passwordInputFieldElement.sendKeys("manager");
		
		//step 5: click on login button
		//identify login button and use click method
		driver.findElement(By.id("loginButton")).click();
		
		//step 6: Validate home page
		String actualTitle=driver.getTitle();
		String ExpectedTitle="actiTIME - Enter Time-Track";
		System.out.println("title validation "+actualTitle.equals(ExpectedTitle));
		//validation will fail as the page takes time from login to goto home page as jvm is not waiting for it to get change the title
		if(actualTitle.equals(ExpectedTitle)) {
			System.out.println(ExpectedTitle);
			System.out.println("validation passed");
			
		}else {
			System.out.println("validation failed");
		}

		//now to solve this problem we have to wait and make jvm to open the home page 
		//thus use implicit and explicit wait method.Here only explicit wait() will solve our issue
		//so let's see that in next program
	}
	/**
	Open chrome browser
	Enter application URL
	Enter usernams as admin
	enter password as manager
	click on login button
	validation home page
	click on logout button
	validate login page
	*/
	
	
	
	
	
	
	

}

