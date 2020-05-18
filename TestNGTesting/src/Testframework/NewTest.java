package Testframework;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Parameters;

public class NewTest{
	
	WebDriver d;
	
	
  @Test
  @Parameters("browser")
  public void verifyingpagetitle(String browserName) throws Exception {
	  
	  if(browserName.equalsIgnoreCase("firefox")) {
		  d=new FirefoxDriver();
		  
	  }
	  else if(browserName.equalsIgnoreCase("Chrome")) {
		  
		
		  System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		  
		  d=new ChromeDriver();
		  
	  }
	  else if(browserName.equalsIgnoreCase("IE")) {
		  System.setProperty("webdriver.ie.driver", "G:\\Drivers\\IEdriverServer.exe");
		  d=new InternetExplorerDriver();
		  
	  }
	  
	  
	  Thread.sleep(3000);
	  d.manage().window().maximize();
	  Thread.sleep(3000);
	  d.get("http://learn-automation.com/");
		Thread.sleep(6000);
		System.out.println(d.getTitle());
		Thread.sleep(6000);
		d.quit();
	  
  }


}
