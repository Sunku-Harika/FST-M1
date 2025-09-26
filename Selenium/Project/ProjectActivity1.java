package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity1 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		 driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
		
	}
	
	@Test
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");	
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	

}
