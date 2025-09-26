package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity3 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		 driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");	
		
		
	}
	
	@Test
	public void getFooterText() {
		
		String text=driver.findElement(By.id("admin_options")).getText();
		System.out.println("copyright text :"+text);
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
