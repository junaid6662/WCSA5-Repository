package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartCase6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[contains(@title, 'Search for products, brands and more')]")).sendKeys("Hp Laptop" , Keys.ENTER);
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Processor']")).click();*/
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text() ,'HP Omen Core i5 7th Gen ')]/../..//div[text()='₹87,490']")).click();
	
}
}
