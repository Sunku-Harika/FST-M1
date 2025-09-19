package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Page Title: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' Success!']")));
		
		String msg=driver.findElement(By.xpath("//h1[text()=' Success!']")).getText();
		
		System.out.println(msg);
		
		driver.quit();
		
		

	}

}
