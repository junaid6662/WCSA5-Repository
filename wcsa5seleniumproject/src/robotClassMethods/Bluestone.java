package robotClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwkLCkBhA9EiwAka9QRiwoLz0QBXISekmCKCjNg-PC-MvDp2GsXzDZA6z4PhKgKZ57MmP86BoCUl8QAvD_BwE");
	driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	WebElement target1 = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
    Actions act = new Actions(driver);
    Thread.sleep(2000);
    act.moveToElement(target1).perform();
    driver.findElement(By.xpath("//a[text()='Band']")).click();
    Thread.sleep(4000);
    //click and hold
    WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
    for (int i = 0; i < 2; i++) {
		act.doubleClick(target2).perform();
		act.clickAndHold(target2).perform();
	}
     
    //copy the text
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_C);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_C);
    Thread.sleep(2000);
    driver.findElement(By.id("search_query_top_elastic_search")).click();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    
    Thread.sleep(2000); 
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) {
		Thread.sleep(1000);
		driver.close();
	} else {
      System.out.println("Exception!!!!!");
	}
    

}
}
