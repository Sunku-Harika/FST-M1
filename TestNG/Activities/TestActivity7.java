package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {

	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {

		driver = new FirefoxDriver();

		driver.get("https://training-support.net/webelements/login-form");

	}

	@DataProvider(name = "Authentication")
	public static Object[][] cred() {

		return new Object[][] { { "admin1", "password1", "Invalid credentials" },
				{ "wrongAdmin", "wrongPassword", "Invalid credentials" }

		};
	}

	@Test(dataProvider = "Authentication")

	public void Testlogin(String username, String password, String msg) {

		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));

		usernameField.clear();
		passwordField.clear();

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

		String loginMessage = driver.findElement(By.id("subheading")).getText();
		Assert.assertEquals(loginMessage, msg);

	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}
