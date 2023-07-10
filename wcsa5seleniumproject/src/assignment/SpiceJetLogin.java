package assignment;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import net.bytebuddy.asm.Advice.Enter;

public class SpiceJetLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9586584524");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdgsh122");
	Thread.sleep(2000);
	driver.findElement(By.xpath(" /html/body/div[2]/div/div/div[1]/div/div[2]/div[7]")).click();
}
}
