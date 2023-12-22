package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'downloads')])[1]")).click();
		
		WebElement drop = driver.findElement(By.id("products-orderby"));
		
		Select s = new Select(drop);
		
		s.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=10");
	}
}
