package TESTNG_pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.Assert;


public class LMS_Activity2 {
	WebDriver driver;
		
	@BeforeMethod
	public void beforeMethod() {
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
		
	
	@Test
	public void exampleTestCase() {
		String temp = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		Assert.assertEquals("Learn from Industry Experts", temp);
		System.out.println("Heading of this page is:" + temp);
			
	}
		
			
	@AfterMethod
	public void afterMethod() {
		driver.close();
		
	}
			
}


