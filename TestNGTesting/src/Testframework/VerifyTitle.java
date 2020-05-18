package Testframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver d;
	
	@Test
	public void OpenBrowser() throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		 d=new ChromeDriver();
		
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.get("http://learn-automation.com/");
		Thread.sleep(9000);
		
	}
	
	@Test
	public void VerTitl() throws InterruptedException {
		
	
		
		String mytitle= d.getPageSource();
		System.out.println(mytitle);
		
		//String exptitle="Automation - Selenium WebDriver tutorial Step by Step";
		
		//Assert.assertEquals(mytitle,exptitle);
		System.out.println("Testcase pass");
		
		
		Assert.assertTrue(mytitle .contains( "Automation - Selenium WebDriver tutorial"));
		System.out.println("Assert pass");
	}
		
		@Test
		public void CloseBrowser() throws Exception{
		
		d.quit();
		
	}

}
