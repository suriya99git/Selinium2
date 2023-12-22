package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html ");
		
		driver.findElement(By.xpath("//input[@name='red']")).click();
		
//		boolean red = driver.findElement(By.xpath("//input[@name='red']")).isSelected();
//		
//		if(red) {
//			System.out.println("red radio is selected");
//		}
//		else {
//			System.out.println("red radio is not selected");
//		}
		
		if(driver.findElement(By.xpath("//input[@name='red']")).isSelected()) {
			System.out.println("red radio is selected");
		}
		else {
			System.out.println("red radio is not selected");
		}
		
	}
}
