package QCO_SOJVD_M13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJeweelary {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Jewelry")).click();
		
		List<WebElement> cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		
		for (WebElement Element : cart) {
			
			Element.click();
	
			driver.findElement(By.cssSelector("input[id=product_attribute_71_10_16]")).click();
			driver.findElement(By.cssSelector("input[id='add-to-cart-button-71']")).click();
			driver.navigate().back();
		}
		
	}
}
