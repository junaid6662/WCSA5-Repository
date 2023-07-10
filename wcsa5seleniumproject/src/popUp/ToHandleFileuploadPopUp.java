package popUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileuploadPopUp {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(1500);
	WebElement upload = driver.findElement(By.id("uploadfile"));
	Thread.sleep(1500);
	Actions act = new Actions(driver);
	act.click(upload).perform();
	File file = new File("./AutoIDPrograms/WindowPopup.exe");
	String abs = file.getAbsolutePath();
	Runtime.getRuntime().exec(abs);
	//Runtime.getRuntime().exec("./AutoIDPrograms/WindowPopup.exe");
	
}
}
