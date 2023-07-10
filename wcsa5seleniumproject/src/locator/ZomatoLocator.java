package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.zomato.com/india");
	driver.findElement(By.linkText("Sign up")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Md juned alam");
	driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("sgajdg@gmail.com");
	driver.findElement(By.cssSelector("input[class='sc-1o2pknd-1 iPRmnw']")).click();
	driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 dkwpEa']")).click();
	
	
	
	
}
}
