package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac6 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//driver.get("http://desktop-ualjqae/login.do");
	driver.get("http://desktop-ualjqae/logi"
			+ "n.do");
	Thread.sleep(1500);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(1500);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1500);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	 
}
}
