package advanceTestNgPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;



public class DataProvider extends SeleniumUtility {
	/** This test method declares that its data should be supplied by data
	 * provider "getdata" is the function name which is passing the data number of the columns  
	 * should match the number of input parameter
	 * 
	 */
  @Test(dataProvider = "getdata")
  public void setdata(String username,String password) {
	  System.out.println("you have provided username as "+username);
	  System.out.println("you have provided password as "+password);
  }
  @Test(dataProvider ="testdata")
  public void Testlogin(String browser,String username,String password) {
	  setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
	  driver.close();
}
  
  @org.testng.annotations.DataProvider(name="testdata") 
  public Object[][] getuserdetails(){
	  /** Rows- Number of time test has to be repeated
	   * Columns-Number of test data 
	   */
	  Object[][] data=new Object[3][3];
	  //1st row
	  data[0][0]="chrome";
	  data[0][1]="admin";
	  data[0][2]="Test@123";
	  //2nd row
	  data[1][0]="chrome";
	  data[1][1]="admin";
	  data[1][2]="pass@123";
	  //3rd row
	  data[2][0]="chrome";
	  data[2][1]="";
	  data[2][2]="";
	  return data;

  }

  @org.testng.annotations.DataProvider(name="getdata")
  public Object[][] getdata(){
	  /**rows-Number of time test has to be repeated
	   * columns-number of test data
	   */
	  Object[][] data=new Object[3][2];
	  //1st row
	  data[0][0]="admin";
	  data[0][1]="admin";
	  //2nd row 
	  data[1][0]="";
	  data[1][1]="";
	  //3rd row
	  data[2][0]="guestuser3";
	  data[2][1]="pass123";
	  return data;
	  
	  
	  
	  
  }
	

}
