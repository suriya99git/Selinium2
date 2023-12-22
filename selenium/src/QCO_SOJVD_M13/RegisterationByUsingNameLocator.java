package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterationByUsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Suriya");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("Johnson");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("john128@gmaill.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("register-button")).click();
	}
}
