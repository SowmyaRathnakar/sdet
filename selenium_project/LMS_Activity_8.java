package TESTNG_pk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity_8 {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
		
	
	@Test
	public void exampleTestCase() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']")).click();
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Sowmya Rathnakar");
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("sowmyarathnakar01@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("I would like to join course.");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();	
		//After submission message
		String temp=driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
		System.out.println("Message displayed after submission is:" + temp);
			
	}
		
			
	@AfterMethod
	public void afterMethod() {
		driver.close();
		
	}
			
}
