package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-ualjqae/login.do");
	WebElement usnTB = driver.findElement(By.name("username"));
	WebElement passTB = driver.findElement(By.name("pwd"));
	usnTB.sendKeys("admin");
	passTB.sendKeys("manager");
	Thread.sleep(2000);
	usnTB.clear();
	passTB.clear();
	Thread.sleep(2000);
	/*driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("pwd")).clear();*/
	
}
}
