package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ByUpcastingToRemoteWebDriverClass {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/facebook.png");
	Files.copy(src, dest);
	
	
}
}
