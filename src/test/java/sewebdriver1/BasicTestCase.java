package sewebdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTestCase {

	public static void main(String[] args) {

// Launch the Chrome browser.
		
    // WebDriver is an Interface which has all the methods to interact with browser.
    // Since it is an Interface, we need to implement it to use its methods. Since we
    // are using Chrome browser, we are creating object of ChromeDriver class to use WebDriver methods.
    
		// ChromeDriver driver = new ChromeDriver(); We can store only ChromeDriver object, so 
		WebDriver driver = new ChromeDriver();
		
// Open URL
		
		driver.get("https://www.benefitcosmetics.com");
		
// Validate title of the page
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Makeup, Pore Care, & Beauty Services | Benefit Cosmetics";
		if(actualTitle.equals(expectedTitle))
			System.out.println("title is validated");
		else
		    System.out.println("title validation failed");
	
// Click an element
		
		WebElement element = driver.findElement(By.id("face"));
		element.click();
// Verify the second web page is loaded successfully.		
		
		if(driver.getCurrentUrl().equals("https://www.benefitcosmetics.com/en-us/face"))
			System.out.println("Face products page is loaded successfully");
		else
			System.out.println("Face products page is not loaded successfully");
// Verify an element is visible on second page
		
		String elementText = driver.findElement(By.className("breadcrumb-item")).getText();
		System.out.println(elementText);
		if(elementText.equals("Face"))
			System.out.println("element is visible");
		
		driver.quit();
		
	}

}
