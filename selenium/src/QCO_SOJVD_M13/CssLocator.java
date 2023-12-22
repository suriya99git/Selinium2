package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://demowebshop.tricentis.com/");
		

		d.findElement(By.cssSelector("#small-searchterms")).sendKeys("computer");
		
		d.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
	}
}
