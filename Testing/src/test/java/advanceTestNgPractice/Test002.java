package advanceTestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test002 {
  @Test(retryAnalyzer = advanceTestNgPractice.RetryAnalyzer.class)
  public void Test1() {
	  Assert.assertEquals(false, true);
	  org.testng.log4testng.Logger log= org.testng.log4testng.Logger.getLogger(Test002.class);
  }
  @Test
   public void Test2() {
	   Assert.assertEquals(false, true);
	
}  
}
