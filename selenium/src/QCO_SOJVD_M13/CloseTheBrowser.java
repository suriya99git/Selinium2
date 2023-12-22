package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		  
		Thread.sleep(2000);
		
		driver.close();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://demowebshop.tricentis.com/");
	}
}
