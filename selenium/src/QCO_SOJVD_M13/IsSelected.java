package QCO_SOJVD_M13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args)  {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		boolean button = driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();

		if(button) {

			System.out.println("Before clicking ---> selected");
		}
		else {
			System.out.println("Before clicking --->it is not  selected");
		}
		
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();

		boolean button1 = driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
		
		if(button1) {
			System.out.println("After clicking---->selected");
		}
		else {
			System.out.println("After clicking --->it is not  selected");
		}


	}
}
