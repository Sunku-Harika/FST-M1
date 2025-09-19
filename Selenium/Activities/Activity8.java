package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

       
        driver.get("https://training-support.net/webelements/mouse-events");
        
        System.out.println("Page title: " + driver.getTitle());
        
        
        WebElement cargoLock = driver.findElement(By.xpath("(//h1[@class='svelte-hs12g9'])[1]"));
        WebElement cargoToml = driver.findElement(By.xpath("(//h1[@class='svelte-hs12g9'])[2]"));
        WebElement srcButton = driver.findElement(By.xpath("(//h1[@class='svelte-hs12g9'])[3]"));
        WebElement targetButton = driver.findElement(By.xpath("(//h1[@class='svelte-hs12g9'])[4]"));
        
        builder.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(5000).click(cargoToml).build().perform();
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        builder.doubleClick(srcButton).pause(3000).contextClick(targetButton).pause(3000).build().perform();
        
        WebElement open=driver.findElement(By.xpath("//span[text()='Open']"));
        
        builder.click(open).pause(5000).build().perform();
        
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);

        // Close the browser
        driver.quit();

	}

}
