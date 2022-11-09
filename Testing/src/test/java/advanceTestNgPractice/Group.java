package advanceTestNgPractice;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = "Regression")
	public void testCaseOne() {
		System.out.println("I am test case one method of group regression");		
	}
	@Test(groups = "Smoke")
	public void testCaseTwo() {
		System.out.println("I am test case two method of group smoke");		
	}
	@Test(groups="Smoke")
	public void testCaseThree() {
		System.out.println("I am test case three method of group smoke");
	}
	@Test(groups="Regression")
	public void testCasefour() {
		System.out.println("I am test case four method of group Regression");
	}
	@Test(groups="Regression")
	public void testCaseFive() {
		System.out.println("I am test case Five  method of group Regression");
	}
	@Test(groups="Smoke")
	public void testCaseSix() {
		System.out.println("I am test case six method of group smoke");
		
	}
}
