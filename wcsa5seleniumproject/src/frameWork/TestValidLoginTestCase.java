package frameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLoginTestCase {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-ualjqae/login.do");
	Thread.sleep(2000);
	
	// read the data from excel file and test the login page
	FileInputStream fis = new FileInputStream("./Data/ActiTimeTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("VALIDCREDS");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String validUsername = cell.getStringCellValue();
	Thread.sleep(2000);
	
	FileInputStream fis2 = new FileInputStream("./Data/ActiTimeTestData.xlsx");
	Workbook wb2 = WorkbookFactory.create(fis2);
	Sheet sheet2 = wb2.getSheet("VALIDCREDS");
	Row row2 = sheet2.getRow(1);
	Cell cell2 = row2.getCell(1);
	String validPassword = cell2.getStringCellValue();
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys(validUsername);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(validPassword);
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
