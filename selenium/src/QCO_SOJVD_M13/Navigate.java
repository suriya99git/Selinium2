package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		System.out.println();
		
	}
}
