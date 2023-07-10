package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*Dimension size = new Dimension(400,300 ); //Dimension( int width , int height)
		driver.manage().window().setSize(size); */
		
		// Import Point from selenium library
		Point point = new Point(350, 400);
		driver.manage().window().setPosition(point);
	}

}
