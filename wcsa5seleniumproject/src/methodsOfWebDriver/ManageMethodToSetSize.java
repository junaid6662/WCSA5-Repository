package methodsOfWebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// Import Dimension from selenium library
		Dimension size = new Dimension(800,700 ); //Dimension( int width , int height)
		driver.manage().window().setSize(size);
		
	
	}

}
