package advanceTestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTc {
  @Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class )
  public void Test1() {
	  Assert.assertEquals(false, true);
  }
  @Test
  public void Test2() {
	  Assert.assertEquals(false, true);
  }

	
}

