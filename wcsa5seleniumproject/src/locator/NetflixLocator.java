package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("junedthewarrior@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("21M12j96@");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
        Thread.sleep(6000);
        driver.close();
		
	}

}
