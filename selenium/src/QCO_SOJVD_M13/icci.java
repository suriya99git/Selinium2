package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class icci {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://icc-cricket.com/rankings/mens/overview");
		
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'2')]/parent::tr/child::td[2]/child::span[1]")).getText());
	}
}
