package sewebdriver1;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTestCase {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.benefitcosmetics.com/en-us/product/all-purpose-pencil-sharpener-PENCIAM01.html");
     
//Click a product 
/*  
    JavascriptExecutor je = (JavascriptExecutor)driver;
    //WebElement hoola = driver.findElement(By.linkText("HOOLA"));
    driver.manage().window().maximize();
    je.executeScript("window.scrollBy(0,30200)");
  //  driver.manage().window().maximize();
    WebElement hoola = driver.findElement(By.linkText("HOOLA"));
    System.out.println(hoola.getText());
    hoola.click();
*/  
     
//Click Add to Bag
  
     driver.manage().window().maximize();
   String producttext = driver.findElement(By.xpath("//h1[@class='product-name js-product-name']")).getText();
    //String producttext = driver.findElement(By.className("product-name js-product-name")).getText();
    System.out.println(producttext);
     //je.executeScript("window.scrollBy(0,10000)");
     WebElement cartbutton = driver.findElement(By.id("pdp-add-cart-toggle-btn"));
     cartbutton.click();
    String text = driver.findElement(By.xpath("//h2[@role='status']")).getText();
     System.out.println(text);
    
     
     
     
     
     
     
     
     // je.executeScript("arguments[0].scrollIntoView();",cartbutton);
    // je.executeScript("window.scrollBy(0,39450)");
    //Verify name of the product in the bag is same as the name of the product added from the PDP page
   // if(driver.findElement(By.xpath(null))).getText().equals(hoola.getText()))
   // 	System.out.println("Name of the product in the Bag is same as name of the product added from pdp page");
    	
  // Click an element
		
  	/*	WebElement element = driver.findElement(By.id("lips"));
  		element.click();
  		System.out.println(driver.g));
  		//driver.findElement(By.id("closeIconContainer")).click();
  		
  		// WebElement hoola = driver.findElement(By.linkText("BENETINT"));
  		//System.out.println(hoola);
  		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
    	    
  	//	Set<String> windowhandles = driver.getWindowHandles();
  		//System.out.println(driver.getWindowHandles().size());
  		//driver.switchTo().window(windowhandle).close();
  		
  		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
  	  //  wait.until(ExpectedConditions.elementToBeClickable(hoola));
  		//Object[] windowHandles=driver.getWindowHandles().toArray();
       // driver.switchTo().window((String) windowHandles[0]);
  		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
    	    //wait.until(ExpectedConditions.elementToBeClickable(hoola));
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
   	    //wait.until(ExpectedConditions.elementToBeClickable(hoola));
  		//hoola.click();
  		 
  		 */

	}

}

