package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	
	WebDriver driver;
  @Test(priority=1)
  public void testcase1() {
	  
	  Assert.assertEquals(driver.getTitle(), "Training Support");
	  driver.findElement(By.xpath("//a[text()='About Us']")).click();
	  
	  String title=driver.getTitle();
	  
	  System.out.println("Title of new page:"+title);
	  
	  Assert.assertEquals(title, "About Training Support");
	  
  }
  
  @Test(priority=2)
  public void testcase2() {
	  
	  
	  String title=driver.getTitle();
	  
	  System.out.println("Title of new page:"+title);
	  
	  Assert.assertEquals(title, "About Training Support");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://training-support.net");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
