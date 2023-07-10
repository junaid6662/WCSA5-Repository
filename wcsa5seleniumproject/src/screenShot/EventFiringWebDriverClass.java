package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class EventFiringWebDriverClass {
public static void main(String[] args) throws IOException {
	//////Upcasting is necessary in eventFiring
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://twitter.com/i/flow/login");
	EventFiringWebDriver event = new EventFiringWebDriver(driver);
    File src = event.getScreenshotAs(OutputType.FILE);
    File dest = new File("./Screenshots/twiter.png");
	Files.copy(src, dest);
}
}
