package Activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {

	
	AndroidDriver driver;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("android");
		caps.setAutomationName("UiAutomator2");
		caps.setApp("C:\\Users\\004PGZ744\\eclipse-workspace\\FST-Appium\\src\\test\\resources\\Calculator.apk");
		caps.noReset();
		
		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, caps);
		
		
	}
	
	@Test
	public void multiplyTest() {
		
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.id("digit_7")).click();
		
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result=driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("Result: " + result);
		Assert.assertEquals(result, "56");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	

}
