package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
	
	WebDriver driver;

@BeforeClass
public void setup() {
	driver=new FirefoxDriver();
	driver.get("https://training-support.net/webelements/target-practice/");	
}

@Test
public void testcase1() {
	
	String title = driver.getTitle();
    System.out.println("Title of the page: " + title);

	Assert.assertEquals(title, "Selenium: Target Practice");
}

@Test
public void testcase2() {
	
	WebElement blackButton =driver.findElement(By.xpath("//button[text()='Black']"));

	Assert.assertEquals(blackButton.getText(), "black");;
}

@Test(enabled=false)
public void testcase3() {
	 System.out.println("The testcase will be skipped");
	
}

@Test()
public void testcase4() {
	throw new SkipException("Skipping test case");
	
}


@AfterClass
public void teardown() {
	driver.quit();
}

}
