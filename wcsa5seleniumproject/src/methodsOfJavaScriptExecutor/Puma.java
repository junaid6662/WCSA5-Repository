package methodsOfJavaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Puma {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://in.puma.com/in/en/eoss/eoss-men?pref_percentageDiscountBadge=40+or+more");
	Point loc = driver.findElement(By.xpath("(//div[@class='relative w-full flex flex-col gap-2'])[17]")).getLocation();
      //2567
	int xAxis = loc.getX();
	int yAxis = loc.getY();
	
	
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-100)+")");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-1000)");
	jse.executeScript("alert('Success!!!')");
	Thread.sleep(1000);
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	driver.quit();
	
	
	
	
}
}
