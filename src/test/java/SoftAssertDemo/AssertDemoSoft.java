package SoftAssertDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemoSoft {
	
		
		SoftAssert softAssert = new SoftAssert();
		
		
	@Test
	public void test1() {
		
		int i = 100;
		int j = 200;
		System.out.println("First Assertion");
		softAssert.assertEquals(i, j, "i and j is not equals");//leave message
		
		System.out.println("Second Assertion:");
		softAssert.assertNotEquals(i, j);
		
		System.out.println("third Assertion");
		softAssert.assertTrue(i>j, "i is not greater than J");//leave message
		// will tell what failed
		softAssert.assertAll();
	}



}


