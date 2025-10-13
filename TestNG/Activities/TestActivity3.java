package activities;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	
		
	}
	
	@Test
	public void test() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		String message=driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals(message, "Welcome Back, Admin!");
	
		
		
		
		
		
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
			
	}
	

}
