package Testframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyCase {
	
	
	@Test
	public void startApp(){
		
		//Assert.assertEquals(12,13);
		System.out.println("startApp");	
	}

	@Test(dependsOnMethods ="startApp")
	public void loginApp(){
		System.out.println("loginApp");
		
	}
	@Test(dependsOnMethods = {"loginApp","startApp"})
	public void logoutApp(){
		System.out.println("logoutApp");
		
	}
	


}


