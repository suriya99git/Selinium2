package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String sourcecode = driver.getPageSource();
		
		System.out.println(sourcecode);
	}
	
}
