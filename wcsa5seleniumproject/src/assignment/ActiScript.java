package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("http://desktop-ualjqae/login.do");
	String titleLoginPage = driver.getTitle();
	if (titleLoginPage.equals("actiTIME - Login")) {
		System.out.println("Login Page Title is matched &&& Test Case is Passed");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}
	else {
		System.out.println("Title is Not matched !!!!!!!");
	}
	String titleHomePage = driver.getTitle();
	if (titleHomePage.equals("actiTIME - Enter Time-Track")) {
		System.out.println("Home Page Title is matched &&& Test Case is Passed");
		driver.findElement(By.linkText("Logout")).click();
		
	}
	else {
		System.out.println("Title is Not matched !!!!!!");
	}
}
}
