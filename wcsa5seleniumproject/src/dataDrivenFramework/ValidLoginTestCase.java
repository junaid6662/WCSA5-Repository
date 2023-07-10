package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameWork.ReadExcelData;

public class ValidLoginTestCase {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-ualjqae/login.do");
		Thread.sleep(2000);
		Flib flib = new Flib();
		String userName = flib.readExcelData("./Data/ActiTimeTestData.xlsx","VALIDCREDS", 1, 0);
		String password = flib.readExcelData("./Data/ActiTimeTestData.xlsx","VALIDCREDS", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
		
	}

}
