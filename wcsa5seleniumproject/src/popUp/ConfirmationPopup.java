package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/Popup/confirmationpopup.html");
	Thread.sleep(1000);
	driver.findElement(By.id("i2")).click();
	Thread.sleep(1000);
	//Handling by switchTo
	Alert al = driver.switchTo().alert();
//	String alText = al.getText();
//	System.out.println(alText);
	//al.accept();
	al.dismiss();
	
//	//Handle by Robotclass
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_TAB);
//	robot.keyRelease(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}

}
