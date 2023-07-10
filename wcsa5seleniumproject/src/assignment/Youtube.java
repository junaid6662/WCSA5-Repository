package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));
	searchBar.sendKeys("akhiyan milaon kabhi akhiyan",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//yt-formatted-string[@class='miniplayer-title style-scope ytd-miniplayer']")).click();
	
	
}
}
