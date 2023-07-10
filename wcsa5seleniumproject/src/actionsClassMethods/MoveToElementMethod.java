package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwp6CkBhB_EiwAlQVyxW-a-32VvMroxfZ1Icdo5S_tRjAQP__71O6Ycu1-eujZy6DqnXLrKBoCQ8gQAvD_BwE");
	Thread.sleep(1500);
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(1500);
	WebElement target = driver.findElement(By.xpath("//a[.='Coins ']"));
	Actions act = new Actions(driver);
	act.moveToElement(target).perform();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
	Thread.sleep(1500);
	WebElement verify = driver.findElement(By.xpath("//h1[text()='1 gram 24 KT Gold Coin']"));
	if (verify.isDisplayed()) {
		Thread.sleep(2000);
		System.out.println("Web Element is verified !!!!!!");
		driver.close();
	} else {
        System.out.println("Web element is not displayed !!!");
	}
}
}
