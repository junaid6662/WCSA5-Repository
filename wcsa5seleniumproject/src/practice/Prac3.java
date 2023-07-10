package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.co.in/");
	driver.switchTo().activeElement().sendKeys("mobiles");
	Thread.sleep(2000);
	List<WebElement> values = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
//	for (int i = 0; i <values.size(); i++) {
//		String text = values.get(i).getText();
//		System.out.println(text);
//		Thread.sleep(1500);
//	}
	for(WebElement el:values)
	{
		System.out.println(el.getText());
		Thread.sleep(1500);
	}
}
}
