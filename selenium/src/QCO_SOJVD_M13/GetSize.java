package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.id("small-searchterms")).getSize();
		
		System.out.println(size);
		
		int hieght = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Hieght of the search field :"+ hieght);
		System.out.println("Width of the search field  : "+width);
	}
}
