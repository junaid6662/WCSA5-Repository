package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/dropdown.html");
	driver.findElement(By.id("menu")).click();
	/*WebElement dropD = driver.findElement(By.id("menu"));
	dropD.click();*/
}
}
