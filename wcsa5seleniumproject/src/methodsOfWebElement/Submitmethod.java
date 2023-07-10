package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitmethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dggsfgdfhs12");
	driver.findElement(By.name("password")).sendKeys("fdgggfhgf");
	 WebElement butt = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	 if (butt.isEnabled()) {
		 System.out.println("Yess Login button is Enabled !!!!");
		
	}
	 else {
		 System.out.println("Nooo Login button is not  Enabled !!!!");
	}
	 butt.submit();
	 Thread.sleep(2000);
	 driver.navigate().to("http://desktop-ualjqae/login.do");
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(2000);
	 driver.close(); 
	 
}

}
