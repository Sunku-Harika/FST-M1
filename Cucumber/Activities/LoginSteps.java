package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps extends BaseClass {
	
	@Given("the user is on the login page")
	public void openPage() {
		driver.get("https://training-support.net/webelements/login-form");
		assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	
	@When ("the user enters username and password")
	public void entercred() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
	}
	
	@When("the user enters {string} and {string}")
	public void enterCredentialsFromInputs(String username, String password) {
        // Find the input fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        // Clear the fields
        usernameField.clear();
        passwordField.clear();
        // Find username field and enter username
        usernameField.sendKeys(username);
        // Find password field and enter password
        passwordField.sendKeys(password);
    }
	
	@And("clicks the submit button")
	
	public void submitbutton() {
		
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
	}
	
	@Then("get the confirmation message and verify it")
	
	public void verifyLogin() {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2"), "Welcome"));
		String msg=driver.findElement(By.tagName("h2")).getText();
		
		Assertions.assertEquals(msg,"Welcome Back, Admin!");
				
				
	}
	
	@Then("get the confirmation text and verify message as {string}")
    public void confirmMessageAsInput(String expectedMessage) {
    	// Find the confirmation message
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals(expectedMessage, message);
    }
	
	@Then("get the error text and verify message as {string}")
    public void errorMessageAsInput(String expectedMessage) {
    	// Find the confirmation message
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2#subheading"), "Invalid"));
        String message = driver.findElement(By.cssSelector("h2#subheading")).getText();
        // Assert message
        Assertions.assertEquals(expectedMessage, message);
		
       
    }

}
