package Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LoginForm {
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
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
	}
	
    
    @Test(priority=1)
    public void loginpageValidCred() {
    	
    	driver.get("https://training-support.net/webelements");
    	driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Login Form\"))"
            ));
    	
    	driver.findElement(AppiumBy.accessibilityId("Login Form Please sign in!")).click();
    	
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys("admin");
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys("password");
    	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Submit\"]")).click();
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"Login Success!\"]")));
    	String Succesmsg=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Login Success!\"]")).getText();
    	//Login Success!
    	Assert.assertEquals(Succesmsg, "Login Success!");
    	
    }
    @Test(priority=2)
    public void loginpageInvalidCred() {
    	
    	driver.get("https://training-support.net/webelements");
    	driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Login Form\"))"
            ));
    	
    	driver.findElement(AppiumBy.accessibilityId("Login Form Please sign in!")).click();
    	
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys("admin5");
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys("password");
    	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Submit\"]")).click();
    	
	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"subheading\"]")));
    	String Errormsg=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"subheading\"]")).getText();
//    	//Login Success!
   	Assert.assertEquals(Errormsg, "Invalid credentials");
    	
    }
    
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
}





