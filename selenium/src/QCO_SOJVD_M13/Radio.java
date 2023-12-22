package QCO_SOJVD_M13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		List<WebElement> text = driver.findElements(By.xpath("//input[@type='radio']/following-sibling::label"));
		
		   int size = text.size();
		   
		  for(int i=0;i<size;i++)
		  {
			  
			   if(text.get(i).getText().equalsIgnoreCase("Good")){
				   
				   radio.get(i).click();
			   }
		  }
		  
	}
}

//[excellent,good,poor,medium] 
