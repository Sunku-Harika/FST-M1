package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://training-support.net/webelements/dynamic-content");
			System.out.println("Page Title: "+ driver.getTitle());
		
			driver.findElement(By.id("genButton")).click();
			
			WebElement wb= driver.findElement(By.id("word"));
			
			if(wait.until(ExpectedConditions.textToBePresentInElement(wb, "release"))){
			
				System.out.println("Word found: " + wb.getText());
	        
			}
			
			driver.quit();
		
			
	}

}
