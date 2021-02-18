package TESTNG_pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity_4 {

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
	}
	@Test
	public void exampleTest() {
		String temp = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText();
		Assert.assertEquals("Email Marketing Strategies",temp);
		System.out.println("Name of second most popular course is:"+ temp);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
