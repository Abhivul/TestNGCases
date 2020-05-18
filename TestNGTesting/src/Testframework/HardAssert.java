package Testframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	
	@Test
	public void HD1() {
		
		System.out.println("Start the Assert");
		
		Assert.assertEquals(13, 13, "Values do not match");
		
		System.out.println("End the Assert");
	}
	@Test	
public void HD2() {
		
		System.out.println("Start the Assert");
		
		Assert.assertEquals(12, 12.0);
		
		System.out.println("End the Assert");
	
}

	@Test
public void HD3() {
	
	System.out.println("Start the Assert");
	
	Assert.assertEquals("Hello", "Hello", "Values do not match");
	
	System.out.println("End the Assert");

}
	
}
