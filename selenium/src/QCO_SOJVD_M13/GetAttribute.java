package QCO_SOJVD_M13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		for (WebElement e : alllink) {
			
			String content = e.getText();
			String link = e.getAttribute("href");
			
			System.out.println(content +"--->"+ link);
			
		}
	}
}
