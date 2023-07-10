package popUp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the valid Browser Name : ");
	String browseOptions = sc.next();
	if(browseOptions.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	 driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(1500);
	driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJsaw6m4CSSjY-BDbhoIqww1yNYIhtU98-BfrooABq9spGUEUhKNNQcaAgg8EALw_wcB");
	Thread.sleep(1500);
	}
	else if (browseOptions.equals("firefox")) {
		System.getProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--disable-notifications");
		 driver = new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1500);
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJsaw6m4CSSjY-BDbhoIqww1yNYIhtU98-BfrooABq9spGUEUhKNNQcaAgg8EALw_wcB");
		Thread.sleep(1500);
	}
	else if (browseOptions.equals("edge")) {
		System.getProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-notifications");
		driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1500);
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJsaw6m4CSSjY-BDbhoIqww1yNYIhtU98-BfrooABq9spGUEUhKNNQcaAgg8EALw_wcB");
		Thread.sleep(1500);
			
	}
	else
	{
		System.out.println("Enter Valid Browser Name !!!!!!");
	}
	
	
	
	
	
}
}
