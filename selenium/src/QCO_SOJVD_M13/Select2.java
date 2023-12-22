package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/OneDrive/Desktop/Dropdown.html");
	    
		 WebElement dropdown = driver.findElement(By.name("country"));
		 
		 Select s = new Select(dropdown);
		 
		 s.selectByValue("In");
		
	}
}
