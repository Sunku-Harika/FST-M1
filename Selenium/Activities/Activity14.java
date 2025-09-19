package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page title: " + driver.getTitle());
		
		//number of columns in a table
		
		List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Number of columns:" + cols.size());
		
		//number of rows in a table
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of rows:" + rows.size());
		
		//Find and print the Book Name in the 5th row.
		
		String bookname=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		
		System.out.println("Book Name in the 5th row: " + bookname);
		
		//Click the header of the Price column to sort it in ascending order.
		
		driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();

		// Print the cell value of the second row and second column again
		
       bookname=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		
		System.out.println("5th row Book Name after sorting : " + bookname);
		
		driver.quit();
		
	}

}
