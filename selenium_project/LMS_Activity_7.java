package TESTNG_pk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity_7 {

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	public void exampleTest() {
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
		List<WebElement> x = driver.findElements(By.xpath("//div[@class=\"ld-course-list-items row\"]/div "));
		System.out.println("List of course is:"+ x.size());
		
			
	}
	
	@AfterMethod
	public void afterMoethod() {
		driver.quit();
	}
}
