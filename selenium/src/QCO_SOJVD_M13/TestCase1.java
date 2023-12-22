package QCO_SOJVD_M13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 {  //testNg class

//	@Test(groups = "smoke")
//	public void testCase1() {  // test cases
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://demowebshop.tricentis.com/");
//		
//		driver.findElement(By.xpath("//a[text()='Log i']")).click();//no such
//		
//		Reporter.log("testcase pass-1",true);// test script
//	}
//	
//	@Test(dependsOnGroups = "smoke")
//	public void testCase2() {
//		Reporter.log("test case pass-2",true);
//	}
	
	@DataProvider(name = "testdata")
	public Object[][] fetchdata() throws EncryptedDocumentException, IOException {
		
		File f = new File("data//login.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
		
		 
		Object[][]data = new Object[2][2];
		
//		data[0][0] = "suriya";
//		data[0][1] = "Johnson";
//		data[1][0] = "mani";
//		data[1][1] = "kandan";
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
	}

	 @Test(dataProvider ="testdata")
	 public void test(String firstname,String lastname) {
		 
		 Reporter.log(firstname,true);
		 Reporter.log(lastname,true);
	 }
	 
	 
//	@Test
//	public void testCase3() throws EncryptedDocumentException, IOException {
//		
//		File f = new File("data//login.xlsx");
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		
//		Sheet sh = wb.getSheet("sheet1");
//		
//		String firstName = sh.getRow(0).getCell(0).getStringCellValue();
//		String SecondName = sh.getRow(1).getCell(0).getStringCellValue();
//		
//		Reporter.log(firstName,true);
//		Reporter.log(SecondName,true);
//		
//	}
	
	 //Digital downloads         
	
	
}
