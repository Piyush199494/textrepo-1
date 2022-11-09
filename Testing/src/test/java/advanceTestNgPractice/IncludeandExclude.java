package advanceTestNgPractice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class IncludeandExclude {
  @Test(groups="Regression")
  public void addLocationtestCase(){
	  System.out.println("i am method of add location test case");
	  
  }
  @Test(groups="Smoke")
  public void addDepartmentTestcase() {
	 System.out.println("i am method of add department test case");
	
}@Test(groups="Regression")
  public void addEmployeeTestcase() {
	  System.out.println("i am method of add employee tset case");
	
}
  
}
