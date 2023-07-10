package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.ajio.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Shirts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
}
}
