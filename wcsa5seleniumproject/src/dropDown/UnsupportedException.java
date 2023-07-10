package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedException {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/dropdown.html");
	WebElement dD = driver.findElement(By.id("menu"));
	Select sel = new Select(dD);
	Thread.sleep(2000);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	try {
		sel.deselectByIndex(2);
	} catch (UnsupportedOperationException e) {
		System.out.println(e.getMessage());
	}
}
}
