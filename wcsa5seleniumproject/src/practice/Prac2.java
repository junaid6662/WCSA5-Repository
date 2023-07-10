package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("jundgv");
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("125ghjg");
	driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	Thread.sleep(4000);
	driver.close();
}
}
