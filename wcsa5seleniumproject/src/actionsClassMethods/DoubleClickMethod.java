package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-ualjqae/login.do");
	Thread.sleep(1500);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(1500);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1500);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logoOption'and (@value='2')]")).click();
	Thread.sleep(1500);
	WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
    Actions act = new Actions(driver);
    act.doubleClick(target).perform();
    Thread.sleep(3000);
    driver.close();
}
}
