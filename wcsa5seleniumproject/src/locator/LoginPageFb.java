package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageFb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/in/login?nextpage=https%3A%2F%2Fwww.netflix.com%2Fbrowse");
        driver.findElement(By.id("id_userLoginId")).sendKeys("ranitmondal12@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("dgfd");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
	}

}
