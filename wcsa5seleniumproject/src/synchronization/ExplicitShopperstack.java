package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitShopperstack {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.id("electronics")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("electronics")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='samsung galaxy z flip4 ']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("411057");
	explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
	driver.findElement(By.id("Check")).click();
	
}
}
