package QCO_SOJVD_M13;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle
{

	public static void main(String[] args) {
		
		String testdata = "demo web shop";
		
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://demowebshop.tricentis.com/");
		
		String title = driver.getTitle();
		
		if(testdata.equalsIgnoreCase(title)) {
			System.out.println("Test Case is Pass");
		}
		else {
			System.out.println("Test case is fail");
		}
		System.out.println(testdata);
		System.out.println(title);
		
		
		
	}
	
}
