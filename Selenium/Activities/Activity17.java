package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page title: " + driver.getTitle());
		
		WebElement dropdown=driver.findElement(By.cssSelector("select.h-80"));
		
		Select ms=new Select(dropdown);
		
		ms.selectByVisibleText("HTML");
		
		for (int i = 3; i <= 5; i++) {
            ms.selectByIndex(i);
        }
		
		ms.selectByValue("nodejs");
		
		// Print the selected options
		
		List<WebElement> selectedoptions=ms.getAllSelectedOptions();
		
		
		System.out.println("Selected options are: ");
        for (WebElement op : selectedoptions) {
            System.out.println(op.getText());
        }
        
        //Deselect the 5th index option
        ms.deselectByIndex(4);
        // Print the selected options
        selectedoptions = ms.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedoptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
		
		

	}

}
