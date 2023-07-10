package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement target = driver.findElement(By.xpath("//div[text()='More']"));
	System.out.println(target.getSize());
	Thread.sleep(1500);
	System.out.println(target.getLocation());
	Thread.sleep(1500);
	System.out.println(target.getTagName());
	Thread.sleep(1500);
	System.out.println(target.getText());
	Thread.sleep(1500);
	System.out.println(target.isEnabled());
	//Thread.sleep(1500);
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	
}

}
