package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity2 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		 driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");	
		
		
	}
	
	@Test
	public void getUrl() {
		
		String url=driver.findElement(By.xpath("//img[contains(@alt,'SuiteCRM')]")).getAttribute("src");
		System.out.println("Header image URL:"+url);
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
