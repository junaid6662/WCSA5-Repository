package dropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSettDropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/multiDD.html");
	WebElement multiDD = driver.findElement(By.id("menu"));
	Select sel = new Select(multiDD);
	List<WebElement> allOptions = sel.getOptions();
	HashSet<String> hs = new HashSet<String>();
	for (int i = 0; i <allOptions.size() ; i++) {
		String value = allOptions.get(i).getText();
		hs.add(value);
	}
	for(String el:hs) {
		System.out.println(el);
		Thread.sleep(1500);
		
	}
	System.out.println("Size : "+hs.size());
}
}
