package Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Popups {

	
	AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();
	
		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
	}
	
    
    @Test
    public void loginForm() {
    	driver.get("https://training-support.net/webelements");

    	boolean found = false;
    	for (int i = 0; i < 10; i++) {
    	    try {
    	        WebElement popups = driver.findElement(AppiumBy.androidUIAutomator(
    	            "new UiSelector().descriptionContains(\"Popups Work with popups!\")"
    	        ));
    	        popups.click();
    	        found = true;
    	        break;
    	    } catch (Exception e) {
    	        driver.findElement(AppiumBy.androidUIAutomator(
    	            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"
    	        ));
    	    }
    	}
    	if (!found) {
    	    throw new RuntimeException("Popups element not found after scrolling");
    	}
    	
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.Button[@resource-id=\"launcher\"]")));
    	driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"launcher\"]")).click();


wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("username")));
WebElement username = driver.findElement(AppiumBy.id("username"));

       WebElement password = driver.findElement(AppiumBy.id("password"));
        // Enter the credentials
       username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//android.widget.Button[@text=\"Submit\"]")).click();
       String Succesmsg=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Login Success!\"]")).getText();
    	//Login Success!
   	Assert.assertEquals(Succesmsg, "Login Success!");
        


    }
}
