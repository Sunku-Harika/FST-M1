package Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;



import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ToDoListapp {
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		

UiAutomator2Options caps = new UiAutomator2Options();
    caps.setPlatformName("android");
    caps.setAutomationName("UiAutomator2");
    caps.setDeviceName("Android Emulator"); // or your device name
    caps.setApp("C:\\Users\\004PGZ744\\eclipse-workspace\\FST-Appium\\src\\test\\resources\\ts-todo-list-v1.apk");
    caps.noReset();

    URL serverURL = new URI("http://localhost:4723").toURL();
    driver = new AndroidDriver(serverURL, caps);

	}
	
	
	@Test
	public void addTasks() {
		
		//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.app.todolist:id/fab_new_task")));
		
    driver.findElement(AppiumBy.id("fab_new_task")).click();
	//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		//driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("Activity1");
		
	}
	
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}
	

}
