package TESTNG_pk;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity_9 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		
	}

	@Test
	public void exampleTestCase() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/email-marketing-strategies/' and @role ='button']")).click();
		WebElement selct = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/lessons/deliverability-of-your-emails/']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(selct));
		
		selct.click();
		String temp = driver.getTitle();
		Assert.assertEquals("Deliverability Of Your Emails", temp);
		System.out.println("Title is:"+ temp);
		
		List<WebElement> ab= driver.findElements(By.xpath("(//input[@class='learndash_mark_complete_button'])[2]"));
		System.out.println("List size is:" + ab.size());
			if (ab.size()!=0) {
			System.out.println("Course can be marked complete");	
			driver.findElement(By.xpath("(//input[@class='learndash_mark_complete_button'])[2]")).click();
			}			
		    else
			System.out.println("Course is already complete");
			    
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}