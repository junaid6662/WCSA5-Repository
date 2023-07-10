package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitActitime {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("http://desktop-ualjqae/login.do");
	String titleLoginPage = driver.getTitle();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
	wait.until(ExpectedConditions.titleContains(titleLoginPage));
	System.out.println("Condition is satisfied");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
}
//public static void explicitWaitMethod() 
}
