package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		
	}
}
