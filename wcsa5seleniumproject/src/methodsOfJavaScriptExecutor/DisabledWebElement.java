package methodsOfJavaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/disabled.html");
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).sendKeys("admin");
	//To Handle Disabled WebElement
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('i2').value='manager'");
	//togenerate popup
	Thread.sleep(2000);
	jse.executeScript("alert('Hello');");
	Thread.sleep(2000);
//	 Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
	driver.switchTo().alert().accept();
	
}
}
