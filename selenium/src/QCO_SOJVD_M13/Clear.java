package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("small-searchterms")).clear();
	}
}
