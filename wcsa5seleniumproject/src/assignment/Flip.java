package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Laptops");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).submit();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_213eRC _2ssEMF'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Processor Generation']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='10th Gen']")).click();
	List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    for (int i = 0; i < laptops.size(); i++) {
		String laptopsName = laptops.get(i).getText();
		System.out.println(laptopsName);
		Thread.sleep(1000);
	}
	
}
}
