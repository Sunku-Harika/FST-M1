package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity4 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		 driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");	
		
		
	}
	
	@Test
	public void LoginPage() {
		
		WebElement username=driver.findElement(By.id("user_name"));
		WebElement password=driver.findElement(By.id("username_password"));
		WebElement login=driver.findElement(By.id("bigbutton"));
		
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		login.click();
		

        String pageTitle = driver.getTitle();
        System.out.println("Page Title After Login: " + pageTitle);

		
		
		
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	


}
