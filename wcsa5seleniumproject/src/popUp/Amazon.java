package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/ref=nav_logo");
	Thread.sleep(1500);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	String child1 = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	for(String o:child)
	{
		if (child1.equals(child)) {
			driver.switchTo().window(o);
	
		}
		
	}
	
	System.out.println(driver.getTitle());
	
	 
}
}
