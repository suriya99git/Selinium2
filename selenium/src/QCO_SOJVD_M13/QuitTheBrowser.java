package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitTheBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.co.in/");
		 
		 driver.quit();
	}
}
