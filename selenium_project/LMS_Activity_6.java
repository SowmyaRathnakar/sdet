package TESTNG_pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Activity_6 {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	public void exampleTest() {
		
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']")).click();
		String text = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		System.out.println("The title on screen is:"+ text);
		Assert.assertEquals("My Account", text);
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		
		//Logging into My account
		WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='user_pass']"));
		username.sendKeys("root");
		pass.sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		//To verify user is logged in
		String verify= driver.findElement(By.xpath("//a[contains(@class, 'logout')]")).getText();
		Assert.assertEquals("Logout", verify);
		System.out.println("User is logged in.");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
