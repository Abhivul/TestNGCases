package SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertmethod {
	
	@Test
	public void HD1() {
		
		System.out.println("Start the Assert");
		
	SoftAssert assertion =new SoftAssert();
	assertion.assertEquals(12, 12, "Welcome");
		
		System.out.println("End the Assert");
		assertion.assertAll();
	}
	
	@Test	
public void HD2() {
		
		System.out.println("Start the Assert");
		
		Assert.assertEquals(12, (2*6));
		
		System.out.println("End the Assert");
	
}

}
