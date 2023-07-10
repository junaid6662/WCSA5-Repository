package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/Multiselect%20dropdown.html");
	WebElement multiDD = driver.findElement(By.id("menu"));
	Select sel = new Select(multiDD);
	List<WebElement> opt = sel.getOptions();
	
	for(WebElement op:opt)
	{
		if ( op.getText().equals("Biryani")) {
			 op.click();
			 break;
		}
		 
		 
	}
}
}
