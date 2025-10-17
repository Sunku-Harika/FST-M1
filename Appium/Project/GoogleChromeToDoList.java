package Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleChromeToDoList {
	
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

		driver.get("https://training-support.net/webelements");
	}
	
	@Test(priority=1)
	public void toDoListPage() {
		
		

driver.findElement(AppiumBy.androidUIAutomator(
    "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"
));


WebElement toDoList = driver.findElement(AppiumBy.androidUIAutomator(
    "new UiSelector().text(\"To-Do List\")"
));

toDoList.click();


//wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("todo-input")));
       driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"todo-input\"]")).sendKeys("Add tasks to list");

       driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"todo-add\"]")).click();
       driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"todo-input\"]")).sendKeys("Get number of tasks");

       driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"todo-add\"]")).click();
       
       driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"todo-input\"]")).sendKeys("Clear the list");

       driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"todo-add\"]")).click();
       
       

List<WebElement> tasks = driver.findElements(AppiumBy.xpath("//android.widget.ListView/android.view.View"));
System.out.println("Number of tasks: " + tasks.size());

driver.findElement(AppiumBy.xpath("//android.widget.ListView/android.view.View[3]/android.view.View/android.widget.Button")).click();

driver.findElement(AppiumBy.xpath("//android.widget.ListView/android.view.View[4]/android.view.View/android.widget.Button")).click();

driver.findElement(AppiumBy.xpath("//android.widget.ListView/android.view.View[3]/android.view.View/android.widget.Button")).click();

List<WebElement> list = driver.findElements(AppiumBy.xpath("//android.widget.ListView/android.view.View"));
System.out.println("Number of tasks after removing: " + list.size());
Assert.assertEquals(list.size(), 2);

				
	}
	
	@Test(priority=2)
	public void loginpageCorrectCred() {
		
		
		

driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Login Form\"))"
        ));

		
		
	}
	
	
	

}
