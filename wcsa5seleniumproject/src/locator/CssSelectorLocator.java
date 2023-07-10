package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("junaidhhb2@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id^='p']")).sendKeys("21ghgfhg@");//^ is used to match the starting character of attribute value
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name='login']")).click();
}
}
