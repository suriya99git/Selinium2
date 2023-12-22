package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
	
	 public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://shoppersstack.com/");
		 
		 Thread.sleep(5000);
		 
	     WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		 loginbutton.click();
		 
		 //https://shoppersstack.com/
	}
}
