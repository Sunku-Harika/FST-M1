package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
      WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Page title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Harika");
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harika@gmail.com");
		
		driver.findElement(By.xpath("//input[@data-testid=\"event-date\"]")).sendKeys("2025-06-26");
		
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium Practice");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(300);
		
		String text=driver.findElement(By.tagName("h3")).getText();
		
		System.out.println("success message: " + text);
		
		driver.quit();
		
	}

}
