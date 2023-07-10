package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeFlowLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-ualjqae/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Tasks")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Projects & Customers")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Projects & Customers")).click();
	Thread.sleep(2000);
	//create customer
	driver.findElement(By.xpath("//*[@id=\"customersProjectsForm\"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
	//customer name 
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='name']")).sendKeys("TATA Motorss");
	Thread.sleep(2000);
	driver.findElement(By.name("createCustomerSubmit")).click();
	Thread.sleep(2000);
	//create project
	driver.findElement(By.cssSelector("input[style='width: 121pt;']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("select[name='customerId']")).click();
	
}
}
