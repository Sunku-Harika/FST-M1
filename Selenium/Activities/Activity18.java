package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title: " + driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		
		Alert al=driver.switchTo().alert();

		String alerttext=al.getText();
		System.out.println("Text on alert:: " + alerttext);
		
		al.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
		
		
	}

}
