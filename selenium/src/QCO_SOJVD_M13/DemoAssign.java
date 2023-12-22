package QCO_SOJVD_M13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAssign {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.partialLinkText("Digital downloads")).click();
	
	List<WebElement> add = driver.findElements(By.cssSelector("input[value='Add to cart']"));
	
	for (WebElement Element : add) {
		Thread.sleep(1000);
		Element.click();
	}
	
	driver.findElement(By.linkText("Shopping cart")).click();
	List<WebElement> checkbox = driver.findElements(By.className("cart-item-row"));
	
	int qty = checkbox.size();
	
	System.out.println(qty);
	if(qty==3) {
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("Email")).sendKeys("suriya456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
}
}
