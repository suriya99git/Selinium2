package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s = new Select(drop1);
		
		s.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=11");
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		
		Select s2 = new Select(drop2);
		
		s2.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=11&pagesize=12");
		
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		
		Select s3 = new Select(drop3);
		
		s3.selectByValue("https://demowebshop.tricentis.com/digital-downloads?orderby=11&pagesize=12&viewmode=list");
	}
	
	
}
