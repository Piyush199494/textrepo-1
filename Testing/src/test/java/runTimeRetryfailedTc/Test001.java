package runTimeRetryfailedTc;

import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Test001 extends TestListenerAdapter{

	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
		Logger log=Logger.getLogger(Test001.class);
		/*
		 * info
		 * warn
		 * error
		 */
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
