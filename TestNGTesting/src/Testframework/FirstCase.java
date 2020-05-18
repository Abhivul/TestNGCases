package Testframework;

import org.testng.annotations.Test;

public class FirstCase {
	
	
	@Test(priority=1,description="will verify FC")
	public void FC(){
		System.out.println("FC");
		
	}

	@Test
	public void fc(){
		System.out.println("fc");
		System.out.println("git fc");
		
	}
	@Test
	public void SC(){
		System.out.println("SC");
		System.out.println("git fc");
		
	}
	@Test
	public void TC(){
		System.out.println("TC");
		
	}


}
