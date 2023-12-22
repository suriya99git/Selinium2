package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

  /*
   * 
   */
public class Printurl {
	public static void main(String[] args) {
		
		String testdata = "https://www.google.co.in/";
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/");
		 
		String url = driver.getCurrentUrl();
		
		if(testdata.equalsIgnoreCase(url)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
		System.out.println(url);
	}
}
