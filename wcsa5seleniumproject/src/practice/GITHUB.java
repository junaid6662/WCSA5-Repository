package practice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class GITHUB {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://github.com/");
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
}
}
