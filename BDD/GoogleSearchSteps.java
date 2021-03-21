package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
       WebDriver driver = new FirefoxDriver();
       WebDriverWait wait;
       
	
		// TODO Auto-generated method stub
		@Given("^User is on Google Home Page$")
		public void givenFunctionName() {
			driver.get("https://www.google.com/");
			wait = new WebDriverWait(driver, 15);
			
		}

		@When("^User types in Cheese and hits ENTER$")
		public void whenFunctionName() {
			WebElement search = driver.findElement(By.xpath("//input[@class =\"gLFyf gsfi\"]"));
			search.sendKeys("Cucmber");
			search.sendKeys(Keys.ENTER);
		}

		@Then("^Show how many search results were shown$")
		public void thenFunctionName() {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
	        String resultStats = driver.findElement(By.id("result-stats")).getText();
	        System.out.println("Number of results found: " + resultStats);
		}
		
		@And("^Close the browser$")
	    public void closeTheBrowser() {
	        driver.close();
			
		}
	}

