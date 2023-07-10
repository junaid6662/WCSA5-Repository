package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Point loc = driver.findElement(By.name("username")).getLocation();
	System.out.println(loc);
	int xAxis = loc.getX();
	int yAxis = loc.getY();
	System.out.println("X -Axis of web element : "+xAxis+" /nY- Axis of web element : "+yAxis);
}
}
