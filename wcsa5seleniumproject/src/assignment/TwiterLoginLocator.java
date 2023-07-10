package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwiterLoginLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://twitter.com/i/flow/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='text']")).sendKeys("asv@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("bdg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='controlView']")).click();
	//driver.findElement(By.xpath("//input[@name='text']")).sendKeys("sdgjsgd12");
	//Thread.sleep(2000);
}
}
