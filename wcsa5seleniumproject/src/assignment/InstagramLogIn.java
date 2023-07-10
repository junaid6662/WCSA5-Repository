package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogIn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='us']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("dfdb224");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type*='sub']")).click();
	}

}
