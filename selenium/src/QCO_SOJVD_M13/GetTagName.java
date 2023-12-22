package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 System.out.println(driver.findElement(By.className("search-box-button")).getTagName());
	}
}
