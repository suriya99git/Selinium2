package QCO_SOJVD_M13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Digital downloads")).click();
			
		List<WebElement> add_cart = driver.findElements(By.className("product-box-add-to-cart-button"));
			
		for( WebElement e: add_cart) {
			
			Thread.sleep(2000);
			
			e.click();		
		}
			
		Thread.sleep(2000);
		
		driver.findElement(By.className("cart-label")).click();
		
		Thread.sleep(2000);
	
		 List<WebElement> ref = driver.findElements(By.className("cart-item-row"));
		 
		 System.out.println(ref.size());
		 
		if(ref.size()>0) {
			
			System.out.println("product is added");
		}
		else {
			System.out.println("product is not added");
		}
		
	}
}
