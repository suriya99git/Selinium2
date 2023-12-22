package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartDepned_Independe {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		
		driver.findElement(By.xpath("//h1[text()='Digital downloads']/parent::div/following-sibling::div/child::div[3]/child::div[2]/child::div/child::div[2]/child::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
	}
}
