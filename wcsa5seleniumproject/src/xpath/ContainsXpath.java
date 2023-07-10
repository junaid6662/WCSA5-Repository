package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[contains(@name , 'ame')]")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@type , 'word')]")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@type , 'submit')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[contains(@class , 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text() , 'Logout')]")).click();
	Thread.sleep(2000);
	driver.close();
}
}
