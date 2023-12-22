package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		
		 
		WebElement gender = driver.findElement(By.id("gender-male"));

		gender.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.id("FirstName"));
		
		firstname.sendKeys("Suriya");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("LastName"));
		
		lastname.sendKeys("Johnson");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("Email"));
		
		email.sendKeys("suriya378@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("Password"));
		
		password.sendKeys("123456");
		Thread.sleep(2000);
		WebElement confpass = driver.findElement(By.id("ConfirmPassword"));
		
		confpass.sendKeys("123456");
		Thread.sleep(2000);
		WebElement regbutton = driver.findElement(By.id("register-button"));
		
		regbutton.click();
	}

}
