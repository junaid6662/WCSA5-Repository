package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25May {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.naukri.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).sendKeys("alam21juned@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys("21M12j96@nk");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Login' and (@type='submit')]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='nI-gNb-sb__placeholder']")).sendKeys("Software testing");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-search']")).click();

	
}
}
