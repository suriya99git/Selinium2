package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search_button = driver.findElement(By.className("search-box-button"));
		
		if(search_button.isEnabled()) {
			System.out.println("Search button is enabled");
		}
		else {
			System.out.println("Search button is Not enabled");
		}
	}
}
