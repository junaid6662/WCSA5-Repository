package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int lrc = flib.getlastRowCount(EXCEL_PATH, "INVALIDCREDS");
		for (int i = 1; i < lrc; i++) {
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", i, 1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}
