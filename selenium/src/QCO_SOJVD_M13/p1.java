package QCO_SOJVD_M13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/child::li/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='details']/child::div[2]/following-sibling::div[1]/child::div[2]/child::input[1]")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[5]/child::a")).click();
		driver.findElement(By.xpath("//div[@class='details']/child::div[2]/following-sibling::div[1]/child::div[2]/child::input[1]")).click();
		driver.findElement(By.xpath("ul[@class='top-menu']/child::li[6]/child::a")).click();
		driver.findElement(By.xpath("//div[@class='details']/child::div[2]/following-sibling::div[1]/child::div[2]/child::input[1]")).click();
		driver.findElement(By.xpath("//dd[2]/child::input")).sendKeys("1");
		driver.findElement(By.xpath("//div[@class='add-to-cart']/child::div/child::script/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("ul[@class='top-menu']/child::li[7]/child::a")).click();
		driver.findElement(By.xpath("//div[@class='details']/child::div[2]/following-sibling::div[1]/child::div[2]/child::input[1]")).click();
		driver.findElement(By.xpath("//div[@class='giftcard']/child::div[1]/input")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//div[@class='giftcard']/child::div[2]/input")).sendKeys("mailto:Priyanka@gmail.com");
		driver.findElement(By.xpath("//div[@class='giftcard']/child::div[3]/input")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//div[@class='giftcard']/child::div[4]/input")).sendKeys("mailto:Priyanka123@gmail.com");
		driver.findElement(By.xpath("//div[@class='giftcard']/child::div[5]/input")).sendKeys("Have a nice day");
		driver.findElement(By.xpath("//div[@class='add-to-cart']/child::div/child::script/following-sibling::input[1]")).click();
		}
	}

