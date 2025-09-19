package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page title: " + driver.getTitle());
		
		WebElement dropdown=driver.findElement(By.cssSelector("select.h-10"));

		Select s=new Select(dropdown);
		
		s.selectByVisibleText("Two");
		
		System.out.println("Second option: " + s.getFirstSelectedOption().getText());
		
		s.selectByIndex(2);
		System.out.println("Third option: " + s.getFirstSelectedOption().getText());

		s.selectByValue("three");
		
		System.out.println("Fourth option: " + s.getFirstSelectedOption().getText());

		
		for(WebElement opt:s.getOptions()) {
			System.out.println(opt.getText());
		}
		
		driver.quit();
		
	}

}
