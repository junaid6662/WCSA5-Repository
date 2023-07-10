package locator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("bikes");
	Thread.sleep(2000);
	List<WebElement> bikes = driver.findElements(By.xpath("//li[@class='sbct']"));

	for (int i = 0; i < bikes.size(); i++) {
		String bikesOption = bikes.get(i).getText();
		System.out.println(bikesOption);
		Thread.sleep(1000);
	}
	
}
}
