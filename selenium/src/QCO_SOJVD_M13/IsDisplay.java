package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
	    boolean search_textfield = driver.findElement(By.id("small-searchterms")).isDisplayed();
		 
		 if (search_textfield) {
			
			 System.out.println("search field text is present");
			
		}
		 
		 else {
			 System.out.println("search field text is not present");
		 }
	}
}
