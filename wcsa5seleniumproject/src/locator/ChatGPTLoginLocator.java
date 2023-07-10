package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGPTLoginLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.openai.com/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[4]/button[1]/div")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("mjalamofficial@gmai.com");
		Thread.sleep(2000);
		driver.findElement(By.name("action")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("21M12j96@cg");
		Thread.sleep(2000);
		driver.findElement(By.className("c46ddf851 ce6872ff7 c4441db6e c921fd1e6 _button-login-password")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Give me the list of all the locator inselenium and their function",Keys.ENTER);
	}

}
